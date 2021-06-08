package com.rdtl.job.chakri.myapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class Fragment1 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public Fragment1() {

    }


    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    SliderView sliderView;
    int[] images = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.six,
            R.drawable.five};


    ListView DashListView, DashListView2,DashListView3,DashListView4,DashListView5,DashListView6,DashListView7,DashListView8,DashListView9;
    String Dash1List[] = {"Notice/Office order", "TSS-News-Corner","NOC" , "Transfer","Foreign Travel", "Promotion"};
    String Dash1URL [] = {"https://tss.com.bd/tss-old19/Office_order.html","https://tss.com.bd/tss-old19/TSS_News_Corner.html",
            "https://tss.com.bd/tss-old19/NOC.html","https://tss.com.bd/tss-old19/Transfer.html","https://tss.com.bd/tss-old19/Foreign_Travel.html","https://tss.com.bd/tss-old19/promotion.html"};

    String Dash2List[] = {"Annual action Plan ", "Quarterly implementation progress","Committee" , "Best Practice Guideline"};
    String Dash2URL [] = {"https://tss.com.bd/tss-old19/Action_Plan.html","https://tss.com.bd/tss-old19/NIS_Meeting_Minutes.html",
            "https://tss.com.bd/tss-old19/NIS_Committee.html","https://tss.com.bd/tss-old19/Best_Practice_Guideline.html"};


    String Dash3List[] = {"Service Commitment", "Focal Point Officer/","Monitoring Committee " , "Laws / Rules / Policies / Circulars / Guidelines / Notifications"};
    String Dash3URL [] = {"https://tss.com.bd/tss-old19/citizen_charter.html","https://tss.com.bd/tss-old19/Chitizen_Chartered_2020_1.pdf",
            "https://tss.com.bd/tss-old19/CITIZEN_!.pdf","https://tss.com.bd/tss-old19/2020-10-20-14-53-23d7.pdf"};


    String Dash4List[] = {"APA Guidelines/Circulars/APA Team", "Agreements","Monitoring and evaluation report Quarterly implementation progress" , "APAMS software link"};
    String Dash4URL [] = {"https://tss.com.bd/tss-old19/APA_Contract_and_Focal%20Point.html","https://tss.com.bd/tss-old19/APA_new_report.html",
            "https://tss.com.bd/tss-old19/APA_quarterly_report.html","https://apams.cabinet.gov.bd/"};

    String Dash5List[] = {"Innovation Focal Point", "Innovation Team","Committee Meeting Minutes" , "Action plan, Report & Various"};
    String Dash5URL [] = {"https://tss.com.bd/tss-old19/Innovation_Focal_Poin.html","https://tss.com.bd/tss-old19/Innovation_Team.html",
            "https://tss.com.bd/tss-old19/Innovation_Meeting_Minutes.html","https://tss.com.bd/tss-old19/Action_plan_Report.html"};


    String Dash6List[] = {"GRS Officer", "Online Application","Law, Act & Policy" , "GonoSunani"};
    String Dash6URL [] = {"https://tss.com.bd/tss-old19/GRS-1.html","http://www.grs.gov.bd/",
            "https://ptd.gov.bd/site/page/da7eb0f5-824a-4e3e-995b-571529dbbde2/Law,-Act-&-Policy--","https://tss.com.bd/tss-old19/GonoSunani1.html"};

    String Dash7List[] = {"Acts/Rules/Committee/Guidelines", "Designated Officer","Application & Appeal Forms" , "Self-motivated information"};
    String Dash7URL [] = {"https://cabinet.gov.bd/site/page/ae04a3e9-918b-4632-8929-b06713c7a3f8/Acts-Rules-Committee-Guidelines","https://tss.com.bd/tss-old19/Designated%20Officer_Rit.html",
            "https://tss.com.bd/tss-old19/Application_&_Appeal_Forms_rit.html","https://tss.com.bd/tss-old19/Self_motivated_information.html"};


    String Dash8List[] = {"Tender (Local &  International)", "EOI","RFQ "};
    String Dash8URL [] = {"https://tss.com.bd/tss-old19/RFQ-4.html","https://tss.com.bd/tss-old19/RFQ-4.html",
            "https://tss.com.bd/tss-old19/RFQ-4.html"};


    String Dash9List[] = {"Annual Report", "Welfare officer ","E-Nothi", "Telecommunications Act."};
    String Dash9URL [] = {"https://tss.com.bd/tss-old19/Anual_Report.html","https://tss.com.bd/tss-old19/Welfareofficer.html",
            "https://www.nothi.gov.bd/","https://tss.com.bd/tss-old19/telecommunication_act.html"};





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_1, container, false);



        sliderView = v.findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        DashListView = (ListView) v.findViewById( R.id.idList );
        dash1();
        DashListView2 = (ListView) v.findViewById( R.id.idList2 );
        dash2();
        DashListView3 = (ListView) v.findViewById( R.id.idList3 );
        dash3();

        DashListView4 = (ListView) v.findViewById( R.id.idList4 );
        dash4();

        DashListView5 = (ListView) v.findViewById( R.id.idList5 );
        dash5();

        DashListView6 = (ListView) v.findViewById( R.id.idList6 );
        dash6();

        DashListView7 = (ListView) v.findViewById( R.id.idList7 );
        dash7();

        DashListView8 = (ListView) v.findViewById( R.id.idList8 );
        dash8();

        DashListView9 = (ListView) v.findViewById( R.id.idList9 );
        dash9();





        return  v;
    }


    public void dash1(){


        HomeSectiondapter customAdapter= new HomeSectiondapter( getContext(), Dash1List);
        DashListView.setAdapter( customAdapter );

        DashListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash1URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView);

    }

    public void dash2(){
        HomeSectiondapter customAdapter2= new HomeSectiondapter( getContext(), Dash2List);
        DashListView2.setAdapter( customAdapter2 );

        DashListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash2URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView2);

    }

    public  void dash3(){

        HomeSectiondapter customAdapter3= new HomeSectiondapter( getContext(), Dash3List);
        DashListView3.setAdapter( customAdapter3 );

        DashListView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash3URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView3);


    }


    public  void dash4(){

        HomeSectiondapter customAdapter4= new HomeSectiondapter( getContext(), Dash4List);
        DashListView4.setAdapter( customAdapter4 );

        DashListView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash4URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView4);


    }

    public  void dash5(){

        HomeSectiondapter customAdapter5= new HomeSectiondapter( getContext(), Dash5List);
        DashListView5.setAdapter( customAdapter5 );

        DashListView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash5URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView5);


    }

    public  void dash6(){

        HomeSectiondapter customAdapter6= new HomeSectiondapter( getContext(), Dash6List);
        DashListView6.setAdapter( customAdapter6 );

        DashListView6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash6URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView6);


    }

    public  void dash7(){

        HomeSectiondapter customAdapter7= new HomeSectiondapter( getContext(), Dash7List);
        DashListView7.setAdapter( customAdapter7 );

        DashListView7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash7URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView7);


    }

    public  void dash8(){

        HomeSectiondapter customAdapter8= new HomeSectiondapter( getContext(), Dash8List);
        DashListView8.setAdapter( customAdapter8 );

        DashListView8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash8URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView8);


    }

    public  void dash9(){

        HomeSectiondapter customAdapter9= new HomeSectiondapter( getContext(), Dash9List);
        DashListView9.setAdapter( customAdapter9 );

        DashListView9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Toast.makeText( getContext(), Dash1URL[i]+ " is selected",Toast.LENGTH_SHORT).show();

                Intent in2 = new Intent(getContext(),BrowsingActivity.class);
                in2.putExtra("epuzzle", Dash9URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView9);


    }




}
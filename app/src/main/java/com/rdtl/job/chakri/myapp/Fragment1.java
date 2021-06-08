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
    String Dash1URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/","https://www.google.com/","https://www.facebook.com/"};

    String Dash2List[] = {"Annual action Plan ", "Quarterly implementation progress","Committee" , "Best Practice Guideline"};
    String Dash2URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/"};


    String Dash3List[] = {"Service Commitment", "Focal Point Officer/","Monitoring Committee " , "Laws / Rules / Policies / Circulars / Guidelines / Notifications"};
    String Dash3URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/"};


    String Dash4List[] = {"APA Guidelines/Circulars/APA Team", "Agreements","Monitoring and evaluation report Quarterly implementation progress" , "APAMS software link"};
    String Dash4URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/"};

    String Dash5List[] = {"Innovation Focal Point", "Innovation Team","Committee Meeting Minutes" , "Action plan, Report & Various"};
    String Dash5URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/"};


    String Dash6List[] = {"GRS Officer", "Online Application","Law, Act & Policy" , "GonoSunani"};
    String Dash6URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/"};

    String Dash7List[] = {"Acts/Rules/Committee/Guidelines", "Designated Officer","Application & Appeal Forms" , "Self-motivated information"};
    String Dash7URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/"};


    String Dash8List[] = {"Tender (Local &  International)", "EOI","RFQ "};
    String Dash8URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/"};


    String Dash9List[] = {"Annual Report", "Welfare officer ","E-Nothi", "Telecommunications Act."};
    String Dash9URL [] = {"https://www.google.com/","https://www.facebook.com/",
            "https://www.google.com/","https://www.facebook.com/"};





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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash1URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash2URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash3URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash4URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash5URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash6URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash7URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash8URL[i]);

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

                Intent in2 = new Intent(getContext(),HomeBrowserActivity.class);
                in2.putExtra("epuzzle2", Dash9URL[i]);

                startActivity(in2);



            }
        } );

        Helper.getListViewSize(DashListView9);


    }




}
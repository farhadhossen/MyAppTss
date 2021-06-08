package com.rdtl.job.chakri.myapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class NoticeFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public NoticeFragment() {
        // Required empty public constructor
    }


    public static NoticeFragment newInstance(String param1, String param2) {
        NoticeFragment fragment = new NoticeFragment();
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

    ListView Listview;

    String List[] = {"NOC", "Ex-Bangladesh Leave","Office Order","Transfer","Promotion","Tender / EOI/RFQ"};
    String Dash8URL [] = {"https://tss.com.bd/tss-old19/RFQ-4.html","https://tss.com.bd/tss-old19/RFQ-4.html",
            "https://tss.com.bd/tss-old19/RFQ-4.html"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_notice, container, false);

        Listview = v.findViewById(R.id.id_Noticelistview);


        NoticeSectiondapter customAdapter= new NoticeSectiondapter( getContext(), List);
        Listview.setAdapter( customAdapter );

        Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  Toast.makeText( getContext(), List[i]+ " is selected",Toast.LENGTH_SHORT).show();

            /*    Intent in2 = new Intent(getContext(),BrowsingActivity.class);
              //  in2.putExtra("epuzzle", Dash1URL[i]);

                startActivity(in2);*/



            }
        } );



        return  v;
    }
}
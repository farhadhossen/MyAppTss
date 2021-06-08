package com.rdtl.job.chakri.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductTwoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductTwoFragment extends Fragment {

    String s1[], s2[];
    int images[] = {R.drawable.img_one, R.drawable.img_two, R.drawable.img_three,
    R.drawable.img_four, R.drawable.img_five, R.drawable.img_six, R.drawable.img_seven,
            R.drawable.img_eight, R.drawable.img_nine, R.drawable.img_ten, R.drawable.img_eleven,
            R.drawable.img_twelve, R.drawable.img_thirty, R.drawable.img_forty, R.drawable.img_fifty,
            R.drawable.img_sixty, R.drawable.img_seventy, R.drawable.img_eighty};
    RecyclerView recyclerView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProductTwoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProductTwoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProductTwoFragment newInstance(String param1, String param2) {
        ProductTwoFragment fragment = new ProductTwoFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_two, container, false);

        recyclerView = view.findViewById(R.id.idRVP2);



        s1 = getResources().getStringArray(R.array.product_two_list);
        s2 = getResources().getStringArray(R.array.product_two_des);

        MyAdapter myAdapter = new MyAdapter(getContext(), s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}
package com.rdtl.job.chakri.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NoticeSectiondapter extends BaseAdapter {
    Context context;
    String countryList[];
  //  int flags [];
    LayoutInflater inflater;

    /*public CustomAdapter(Context context, String[] countryList, int[] flags, LayoutInflater inflater) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        this.inflater = inflater;
    }*/

    public NoticeSectiondapter(Context applicationContext, String[] countryList) {
        this.context = context;
        this.countryList = countryList;
      //  this.flags = flags;
        inflater = (LayoutInflater.from( applicationContext ));



    }




    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate( R.layout.notice_item,null);
        TextView country = view.findViewById( R.id.idNoticeText);
       // ImageView icon = view.findViewById( R.id.icon );
        country.setText( countryList[i] );
       // icon.setImageResource(flags[i]);
        return view;
    }
}

package com.naeem.europetourplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CountryNameAdapter extends BaseAdapter {
    Context mContext;
    String[] CountryName;
    int[] CountryImage;

    public CountryNameAdapter(Context mContext, String[] countryName, int[] countryImage) {
        this.mContext = mContext;
        this.CountryName = countryName;
        this.CountryImage = countryImage;
    }

    @Override
    public int getCount() {
        return CountryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.country_view,parent,false);
        }
        ImageView countryImage = convertView.findViewById(R.id.countryImage);
        TextView countryName = convertView.findViewById(R.id.countryTex);

        countryName.setText(CountryName[position]);
        countryImage.setImageResource(CountryImage[position]);
        return convertView;
    }
}

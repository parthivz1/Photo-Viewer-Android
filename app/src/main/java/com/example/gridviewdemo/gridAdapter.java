package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class gridAdapter extends BaseAdapter {


    //      private final ArrayList<String> name;
//      private final  ArrayList<String> images;
    private String name [];
    private String images [];

    Context context;


    public gridAdapter(/*ArrayList<String> name*/String[] name,/* ArrayList<String> images*/ String[] images, Context context) {
        this.name = name;
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount()
    {
//        return images.size();
        return images.length;
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
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.single_file,null);

        ImageView img = view.findViewById(R.id.iconimage);
        TextView tv = view.findViewById(R.id.textdata);

        Glide.with(context).load(images[i]).into(img);
        tv.setText(name[i]);
//        Glide.with(context).load(images.get(i)).into(img);
//        tv.setText(name.get(i));

        return view;
    }
}
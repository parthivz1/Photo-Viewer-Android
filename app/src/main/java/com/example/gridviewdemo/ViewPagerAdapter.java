package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    String [] images;
    String [] text;
//    ArrayList<String> images = new ArrayList<>();
//    ArrayList<String> text = new ArrayList<>();

    public ViewPagerAdapter(Context context,/* ArrayList<String> images*/ String [] images,/* ArrayList<String> text*/ String []  text){

        this.context = context;
        this.images = images;
        this.text = text;
    }
    @Override
    public int getCount() {

//           return images.size();
        return images.length;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_pager_adapter,null);
        ImageView viewedimg = view.findViewById(R.id.viewedimage);
        TextView viewedtext = view.findViewById(R.id.viewedtext);


        Glide.with(context).asBitmap().load(images[position]).into(viewedimg);
        viewedtext.setText(text[position]);
//        Glide.with(context).asBitmap().load(images.get(position)).into(viewedimg);
//        viewedtext.setText(text.get(position));

        container.addView(view, 0);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
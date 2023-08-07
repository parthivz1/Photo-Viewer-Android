package com.example.gridviewdemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Clicked extends AppCompatActivity {

    ViewPager viewPager;

    //    ArrayList<String> icons = new ArrayList<>();
//    ArrayList<String> names = new ArrayList<>();
    String [] icons;
    String [] names;

    int position;

    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked);

        viewPager = findViewById(R.id.viewPager);

        Intent intent = getIntent();

        Bundle extra = intent.getExtras();

        if(extra != null){

//            icons = extra.getStringArrayList("icons");
//            names = extra.getStringArrayList("names");
            icons = extra.getStringArray("icons");
            names = extra.getStringArray("names");

            position = extra.getInt("position");
        }

        adapter = new ViewPagerAdapter(this,icons,names);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(position);
    }
}
package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    GridView grid;

//     ArrayList<String> icons2 = new ArrayList<>();
//     ArrayList<String> names2 = new ArrayList<>();

    /**Allow the Internet permission in the manifest to access the path....................**/

    String [] icons = {"https://assets.winni.in/product/primary/2014/6/27071.jpeg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4PZE8BHqVqzXP3h5PrEkl3iw5T1-GVlUuVg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ2NGB2xaw7tgEihONTto7IcFOAy6ZOztolg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtOArVMtVgIQx6J3UM75FG-e3iKC-pHFwBNA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKh79260_fBmQt0ZLc6hCMnok4X8WyQWWY8g&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWTqZ2yZhXEDmeOmM6TooaxiBXNjPJGmOWbg&usqp=CAU ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToaO8AQEBqKHMiKFvf5fkXnyBvac6r04zrIw&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTd1NOh0ZS6hexlHaKA003VyaDdeZS82kIsjA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSIVrzflOseoyyCCVlmbHaiQaOQAmMJL90Aw&usqp=CAU",

            "https://assets.winni.in/product/primary/2014/6/27071.jpeg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4PZE8BHqVqzXP3h5PrEkl3iw5T1-GVlUuVg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ2NGB2xaw7tgEihONTto7IcFOAy6ZOztolg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtOArVMtVgIQx6J3UM75FG-e3iKC-pHFwBNA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKh79260_fBmQt0ZLc6hCMnok4X8WyQWWY8g&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWTqZ2yZhXEDmeOmM6TooaxiBXNjPJGmOWbg&usqp=CAU ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToaO8AQEBqKHMiKFvf5fkXnyBvac6r04zrIw&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTd1NOh0ZS6hexlHaKA003VyaDdeZS82kIsjA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSIVrzflOseoyyCCVlmbHaiQaOQAmMJL90Aw&usqp=CAU",

            "https://assets.winni.in/product/primary/2014/6/27071.jpeg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4PZE8BHqVqzXP3h5PrEkl3iw5T1-GVlUuVg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ2NGB2xaw7tgEihONTto7IcFOAy6ZOztolg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtOArVMtVgIQx6J3UM75FG-e3iKC-pHFwBNA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKh79260_fBmQt0ZLc6hCMnok4X8WyQWWY8g&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWTqZ2yZhXEDmeOmM6TooaxiBXNjPJGmOWbg&usqp=CAU ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToaO8AQEBqKHMiKFvf5fkXnyBvac6r04zrIw&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTd1NOh0ZS6hexlHaKA003VyaDdeZS82kIsjA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSIVrzflOseoyyCCVlmbHaiQaOQAmMJL90Aw&usqp=CAU",

            "https://assets.winni.in/product/primary/2014/6/27071.jpeg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4PZE8BHqVqzXP3h5PrEkl3iw5T1-GVlUuVg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ2NGB2xaw7tgEihONTto7IcFOAy6ZOztolg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtOArVMtVgIQx6J3UM75FG-e3iKC-pHFwBNA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKh79260_fBmQt0ZLc6hCMnok4X8WyQWWY8g&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWTqZ2yZhXEDmeOmM6TooaxiBXNjPJGmOWbg&usqp=CAU ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToaO8AQEBqKHMiKFvf5fkXnyBvac6r04zrIw&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTd1NOh0ZS6hexlHaKA003VyaDdeZS82kIsjA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSIVrzflOseoyyCCVlmbHaiQaOQAmMJL90Aw&usqp=CAU",

            "https://assets.winni.in/product/primary/2014/6/27071.jpeg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4PZE8BHqVqzXP3h5PrEkl3iw5T1-GVlUuVg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ2NGB2xaw7tgEihONTto7IcFOAy6ZOztolg&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtOArVMtVgIQx6J3UM75FG-e3iKC-pHFwBNA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKh79260_fBmQt0ZLc6hCMnok4X8WyQWWY8g&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWTqZ2yZhXEDmeOmM6TooaxiBXNjPJGmOWbg&usqp=CAU ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToaO8AQEBqKHMiKFvf5fkXnyBvac6r04zrIw&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTd1NOh0ZS6hexlHaKA003VyaDdeZS82kIsjA&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSIVrzflOseoyyCCVlmbHaiQaOQAmMJL90Aw&usqp=CAU",
    };

    String[] names = {"Rose","Sunflower","Black Rose","Lotus","Marigold","Jasmin","Bluebell","Lilly","Blooming",
            "Rose","Sunflower","Black Rose","Lotus","Marigold","Jasmin","Bluebell","Lilly","Blooming",
            "Rose","Sunflower","Black Rose","Lotus","Marigold","Jasmin","Bluebell","Lilly","Blooming",
            "Rose","Sunflower","Black Rose","Lotus","Marigold","Jasmin","Bluebell","Lilly","Blooming",
            "Rose","Sunflower","Black Rose","Lotus","Marigold","Jasmin","Bluebell","Lilly","Blooming",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //comment these four lines if use array.
//        Collections.addAll(icons2, icons);//if use this then do not comment icons and name array......
//        Collections.addAll(names2, names);//if use this then do not comment icons and name array......
//        icons2.add("https://assets.winni.in/product/primary/2014/6/27071.jpeg");
//        names2.add("Rose2");


        grid = findViewById(R.id.dataGrid);
        gridAdapter obj = new gridAdapter(/*names2*/names,/*icons2*/icons,this);
        grid.setAdapter(obj);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //use this for show clicked image in image view without use viewpager......(not related to ary & aryList)
//                  String selectedName = name[i];
//                String  selectedIcon = icons[i];
//                startActivity(new Intent(MainActivity.this,Clicked.class).putExtra("icon",selectedIcon)
//                        .putExtra("name",selectedName));


                startActivity(new Intent(MainActivity.this,Clicked.class).putExtra("names", /*names2*/names)
                        .putExtra("icons",/*icons2*/icons).putExtra("position",i));
            }
        });
    }
}
package com.colorcc.myme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainLayoutActivity extends AppCompatActivity {

    private List<OpenAdsImage> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.open_screen_ads);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // 水平 or 垂直移动
        recyclerView.setLayoutManager(linearLayoutManager);

        imageList.add(new OpenAdsImage("first", R.drawable.cute_001));
        imageList.add(new OpenAdsImage("second", R.drawable.cute_002));
        imageList.add(new OpenAdsImage("third", R.drawable.cute_003));
        imageList.add(new OpenAdsImage("forth", R.drawable.cute_004));


        OpenAdsImageAdapter adapter = new OpenAdsImageAdapter(imageList);
        recyclerView.setAdapter(adapter);
    }
}

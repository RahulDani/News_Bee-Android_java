package com.rad.news_bee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome,mscience,mhealth,mtechnology,mentertainment,msports;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;
    ViewPager viewPager;

    String api="05321d96cb544938ab008265ec66aa86";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mtoolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mhome=findViewById(R.id.home);
        mscience=findViewById(R.id.science);
        mhealth=findViewById(R.id.health);
        mtechnology=findViewById(R.id.technology);
        mentertainment=findViewById(R.id.entertainment);
        msports=findViewById(R.id.sports);
        tabLayout=findViewById(R.id.tablayout);


       viewPager=findViewById(R.id.fragmentcontainer);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),6);

        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {  // action of selected tab
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){

                 pagerAdapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


     viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }
}
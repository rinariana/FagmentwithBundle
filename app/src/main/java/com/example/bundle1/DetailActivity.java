package com.example.bundle1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class DetailActivity extends AppCompatActivity {

    private ViewPager viewPager;
   private TabLayout tablayout;
    Pegawai pegawaidetail;
    TabFagmentAdapter pagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tablayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.pager);

        Intent kirim = getIntent();
        pegawaidetail = (Pegawai) getIntent().getSerializableExtra("xyz");
        pagerAdapter = new TabFagmentAdapter(getSupportFragmentManager(),pegawaidetail);
        viewPager.setAdapter(pagerAdapter);
        tablayout.setTabTextColors(getResources().getColor(R.color.colorblue), getResources().getColor(R.color.colorblue));
        tablayout.setupWithViewPager(viewPager);
        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);

    }
}


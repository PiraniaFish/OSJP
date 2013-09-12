package com.test.oop;

import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TitlePageIndicator;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.widget.Button;

import com.test.osjp.R;
import com.test.osjp.R.id;
import com.test.osjp.R.layout;
import com.test.osjp.R.menu;

public class MainActivity_OOP extends FragmentActivity {
    
    FragmentAdapter_OOP mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;
    int Number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
        mAdapter = new FragmentAdapter_OOP(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (TitlePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
//    @Override
//	protected void onStart() {
//		
//		super.onStart();
//		MainPage.mainActivity_OOP=this;
//	}
//
//	@Override
//	protected void onDestroy() {
//	super.onDestroy();
//	MainPage.mainActivity_OOP=null;
//	
//	}
    
}
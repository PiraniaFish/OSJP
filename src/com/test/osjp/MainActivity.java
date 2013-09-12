package com.test.osjp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.test.utils.MainPage;
import com.test.utils.Score_page;
import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TitlePageIndicator;

public class MainActivity extends FragmentActivity {
	
	
    
    FragmentAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;
    int Number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        
        //avoid to reload fragments
        pager.setOffscreenPageLimit(8);
        
        mAdapter = new FragmentAdapter(getSupportFragmentManager());

       
        mPager.setAdapter(mAdapter);

        mIndicator = (TitlePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        
        
    }
    
    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.MainPage:
		Intent intent = new Intent(this,MainPage.class);
		this.startActivity(intent);
		
		return true;
		
		case R.id.GetScore:
  startActivity(new Intent(this,Score_page.class));
			
return true;
		default: return super.onOptionsItemSelected(item);
			
		}
	
	}
  
}
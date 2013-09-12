package com.test.scjp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.test.questions.Q1;
import com.test.questions.Q2;
import com.test.questions.Q3;
import com.test.questions.Q4;
import com.test.questions.Q5;
import com.test.questions.Q6;
import com.test.questions.Q7;
import com.test.questions.Q8;
import com.test.questions.Q9;
import com.viewpagerindicator.IconPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter{

	
	
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    
    
    
    @Override
	public long getItemId(int position) {
		
		return position;
	}




	@Override
    public int getIconResId(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Fragment getItem(int position) 
    {
        
    	// TODO Auto-generated method stub
        Fragment fragment = new Fragment();
        switch(position){
        case 0:
            fragment = new Q1();
            break;
        case 1:
            fragment = new Q2();
            break;
        case 2:
            fragment = new Q3();
            break;
        case 3:
            fragment = new Q4();
            break;
        case 4:
            fragment = new Q5();
            break;
        case 5:
            fragment = new Q6();
            break;
        case 6:
            fragment = new Q7();
            break;
        case 7:
            fragment = new Q8();
            break;
        case 8:
            fragment = new Q9();
            break;
       
        }
        return fragment;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 9;
    }
    
    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch(position){
        case 0:
            title = "Question 1";
            break;
        case 1:
            title = "Question 2";
            break;
        case 2:
            title = "Question 3";
            break;
        case 3:
            title = "Question 4";
            break;
        case 4:
            title = "Question 5";
            break;
        case 5:
            title = "Question 6";
            break;
        case 6:
            title = "Question 7";
            break;
        case 7:
            title = "Question 8";
            break;
        case 8:
            title = "Question 9";
            break;
        }
        return title;
    }

    
}
package com.test.oop;

import com.test.questions.Q1;
import com.test.questions.Q2;
import com.viewpagerindicator.IconPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter_OOP extends FragmentPagerAdapter implements IconPagerAdapter{

    public FragmentAdapter_OOP(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
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
        Fragment fragment = new Q1();
        switch(position){
        case 0:
            fragment = new Q1();
            break;
        case 1:
            fragment = new Q2();
            break;
       
       
        }
        return fragment;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 2;
    }
    
    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch(position){
        case 0:
            title = "Question 1 (OOP)";
            break;
        case 1:
            title = "Question 2 (OOP)";
            break;
       
       
        }
        return title;
    }

}
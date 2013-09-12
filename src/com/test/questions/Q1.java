package com.test.questions;

import com.test.osjp.R;
import com.test.osjp.R.id;
import com.test.osjp.R.layout;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public class Q1 extends Fragment {
    
	CheckBox ch1;
	
	Button btn;
	
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.q1, null);
      
        return v;
        
    }
    
    public void onActivityCreated(Bundle savedInstanceState){
    	
    	super.onActivityCreated(savedInstanceState);
    	ch1 = (CheckBox)getView().findViewById(R.id.q1_C);
    	
    	
    	
    	btn = (Button)getView().findViewById(R.id.Submit_q1);
    	
    	 final SharedPreferences app_preferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
    	btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			SharedPreferences.Editor editor = app_preferences.edit();	
			switch (v.getId()) {
			case R.id.q1_C :
				editor.putInt("answer value1", 1);
				break;

			default:editor.putInt("answer value1", 0);
				break;
			}
//			
			editor.commit();
			ch1.setBackgroundColor(Color.GREEN);
			
			btn.setEnabled(false);
			}
		
    	});
    	
    }
}
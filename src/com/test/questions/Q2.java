package com.test.questions;

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

import com.test.scjp.R;

public class Q2 extends Fragment {
	
	CheckBox ch1;
	CheckBox ch2;
	
	
	Button btn;
	
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.q2, null);
    
        return v;
    }
    
public void onActivityCreated(Bundle savedInstanceState){
    	
    	super.onActivityCreated(savedInstanceState);
    	ch1 = (CheckBox)getView().findViewById(R.id.Q2_B);
    	ch2 = (CheckBox)getView().findViewById(R.id.Q2_D);
   	
    	
    	
    	btn = (Button)getView().findViewById(R.id.Submit_q2);
    	
    	final SharedPreferences app_preferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
    	btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			SharedPreferences.Editor editor = app_preferences.edit();	
			
			if (ch1.isChecked()&ch2.isChecked()){
				editor.putInt("answer value2", 1);
			}else{
				editor.putInt("answer value2", 0);
			}
			editor.commit();
			ch1.setBackgroundColor(Color.GREEN);
			ch2.setBackgroundColor(Color.GREEN);
			
			btn.setEnabled(false);
			}
		
    	});
    	
    }
    
}
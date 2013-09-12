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

public class Q4 extends Fragment {
    
	CheckBox ch1;
	
	Button btn;
	
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.q4, null);
      
        return v;
        
    }
    
    public void onActivityCreated(Bundle savedInstanceState){
    	
    	super.onActivityCreated(savedInstanceState);
    	ch1 = (CheckBox)getView().findViewById(R.id.q4_A);
    	
    	
    	
    	btn = (Button)getView().findViewById(R.id.Submit_q4);
    	
    	final SharedPreferences app_preferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
    	btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			SharedPreferences.Editor editor = app_preferences.edit();	
			
			if(ch1.isChecked() ){
				editor.putInt("answer value4", 1);
			}else{
				editor.putInt("answer value4", 0);
			}
			editor.commit();
			ch1.setBackgroundColor(Color.GREEN);
			
			btn.setEnabled(false);
			}
		
    	});
    	
    }
}
package com.test.questions;

import java.io.IOException;
import java.io.InputStream;

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
import android.widget.TextView;

import com.test.scjp.R;

public class Q8 extends Fragment {
    
	CheckBox ch1;
	
	
	TextView txt;
	
	
	Button btn;
	
	
	
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.q8, null);
      
        return v;
        
    }
    
    public void onActivityCreated(Bundle savedInstanceState){
    	
    	super.onActivityCreated(savedInstanceState);
    	ch1 = (CheckBox)getView().findViewById(R.id.q8_B);
    	    	
    	
    	try {
    		
			InputStream is = getResources().openRawResource(R.raw.q8);
			int size = is.available();
			 byte[] buffer = new byte[size];
	            is.read(buffer);
	            is.close();
	            String text = new String(buffer);
	            txt = (TextView)getView().findViewById(R.id.Q8);
	            txt.setText(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	btn = (Button)getView().findViewById(R.id.Submit_q8);
    	
    	final SharedPreferences app_preferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
    	btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			SharedPreferences.Editor editor = app_preferences.edit();	
			
			if(ch1.isChecked() ){
				editor.putInt("answer value8", 1);
			}else{
				editor.putInt("answer value8", 0);
			}
			editor.commit();
			ch1.setBackgroundColor(Color.GREEN);
			
			btn.setEnabled(false);
			}
		
    	});
    	
    }
}
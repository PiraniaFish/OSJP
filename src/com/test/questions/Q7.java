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

public class Q7 extends Fragment {
    
	CheckBox ch1;
	CheckBox ch2;
	CheckBox ch3;
	
	TextView txt;
	
	
	Button btn;
	
	
	
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.q7, null);
      
        return v;
        
    }
    
    public void onActivityCreated(Bundle savedInstanceState){
    	
    	super.onActivityCreated(savedInstanceState);
    	ch1 = (CheckBox)getView().findViewById(R.id.q7_C);
    	ch2 = (CheckBox)getView().findViewById(R.id.q7_D);
    	ch3 = (CheckBox)getView().findViewById(R.id.q7_E);
    	
    	
    	try {
    		
			InputStream is = getResources().openRawResource(R.raw.q7);
			int size = is.available();
			 byte[] buffer = new byte[size];
	            is.read(buffer);
	            is.close();
	            String text = new String(buffer);
	            txt = (TextView)getView().findViewById(R.id.Q7);
	            txt.setText(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	btn = (Button)getView().findViewById(R.id.Submit_q7);
    	
    	final SharedPreferences app_preferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
    	btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			SharedPreferences.Editor editor = app_preferences.edit();	
			
			if(ch1.isChecked() && ch2.isChecked() && ch3.isChecked()){
				editor.putInt("answer value7", 1);
			}else{
				editor.putInt("answer value7", 0);
			}
			editor.commit();
			ch1.setBackgroundColor(Color.GREEN);
			ch2.setBackgroundColor(Color.GREEN);
			ch3.setBackgroundColor(Color.GREEN);
			btn.setEnabled(false);
			}
		
    	});
    	
    }
}
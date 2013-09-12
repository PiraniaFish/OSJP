package com.test.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.scjp.R;

public class Score_page extends Activity {
TextView final_score;
int finalScore;

	
	 @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 
		    setContentView(R.layout.score_page);
	
		    Button btn = (Button)findViewById(R.id.score_button);
		    btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(view.getContext(), MainPage.class);
			        startActivityForResult(intent, 0);
					
				}
			});
		    Calculate();
	 }

	@Override
	public void onStart() {
		
		super.onStart();
	}

public void Calculate(){
	
	final_score = (TextView)findViewById(R.id.score_textView);
	
	final SharedPreferences app_preferences= PreferenceManager.getDefaultSharedPreferences(this);
	SharedPreferences.Editor editor = app_preferences.edit();	
	int answ1 = app_preferences.getInt("answer value1", 0);
	int answ2 = app_preferences.getInt("answer value2", 0);
	int answ3 = app_preferences.getInt("answer value3", 0);
	int answ4 = app_preferences.getInt("answer value4", 0);
	int answ5 = app_preferences.getInt("answer value5", 0);
	int answ6 = app_preferences.getInt("answer value6", 0);
	int answ7 = app_preferences.getInt("answer value7", 0);
	int answ8 = app_preferences.getInt("answer value8", 0);
	int answ9 = app_preferences.getInt("answer value9", 0);
	
	finalScore = answ1+answ2+answ3+answ4+answ5+answ6+answ7+answ8+answ9;
	final_score.setText("Your score " + finalScore+ " ");
	editor.clear();
	editor.commit();
	
	
}

@Override
public void onBackPressed() {
	
	
}

}

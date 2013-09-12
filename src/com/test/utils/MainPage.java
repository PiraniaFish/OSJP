package com.test.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.test.oop.MainActivity_OOP;
import com.test.scjp.MainActivity;
import com.test.scjp.R;

public class MainPage extends Activity {

//	public static MainActivity mainActivity;
//	public static MainActivity_OOP mainActivity_OOP;
//	public static Score_page score_page;
//	public static MainPage mainPage;
	
	//close all activities
	//public static void close(){
//		if(MainPage.score_page!= null){MainPage.score_page.finish();}
//		if(MainPage.mainActivity_OOP!= null){MainPage.mainActivity_OOP.finish();}
//		if(MainPage.mainActivity!= null){MainPage.mainActivity.finish();}
//		if(MainPage.mainPage!= null){MainPage.mainPage.finish();}
//	}
	 @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main_page);

	    Button orderButton = (Button)findViewById(R.id.OSJP_Button);
	    orderButton.setOnClickListener(new View.OnClickListener() {

	      @Override
	      public void onClick(View view) {
	        Intent intent = new Intent(view.getContext(), MainActivity.class);
	        startActivityForResult(intent, 0);
	      }

	    });
	  
	 Button OOP = (Button)findViewById(R.id.OOP_button);
	 OOP.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(v.getContext(),MainActivity_OOP.class);
			startActivityForResult(intent, 0);
		}
	});
	 
	 

	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_page_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.quit:
			this.finish();
			Intent intent = new Intent(Intent.ACTION_MAIN);
			intent.addCategory(Intent.CATEGORY_HOME);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(intent);
			return true;

		default:
			return false;
		}
		
	}


}

package com.rodrigo.garcia.pelaez.awsome2_project;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.e("Banana", "If music be the food of love!");
		// TextView textview= (TextView) findViewById(R.id.textView1);
		// textview.setMovementMethod(new ScrollingMovementMethod());
		// See http://stackoverflow.com/questions/1748977/making-textview-scrollable-in-android
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

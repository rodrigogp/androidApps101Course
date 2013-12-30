package com.coursera.android101apps.rgp.computerscientists;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DisplayComputerScientists extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_computer_scientists);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_computer_scientists, menu);
		return true;
	}

}

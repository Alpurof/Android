package com.rogama.comunicacionentreactivities;

import com.rogama.comunicacionentreactivities.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void lanzar2ventana(View v) {
		Intent inten = new Intent(this, ventana2.class);
		inten.putExtra("usuario", "Ramon");
		inten.putExtra("edad", 25);
		startActivity(inten);
	}
	
}

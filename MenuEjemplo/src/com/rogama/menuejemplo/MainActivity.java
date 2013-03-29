package com.rogama.menuejemplo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
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

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.item1:
			Toast toas = Toast.makeText(getApplicationContext(), "Boton de menu numero 1", Toast.LENGTH_LONG);
			toas.show();
			break;
		case R.id.item2:
			Toast toas2 = Toast.makeText(getApplicationContext(), "Boton de menu numero 2", Toast.LENGTH_LONG);
			toas2.show();
			break;
		}
		return true; //consumimos el item para que no se propague
	}

}

package com.rogama.lanzar2ventana;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button BtnTerceraventana; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		BtnTerceraventana = (Button) findViewById(R.id.button2);
		BtnTerceraventana.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				lanzarVentanaPorCodigo(null);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void lanzar2ventana(View v) {
		Intent inten = new Intent(this, ventana2.class);
		startActivity(inten);
	}
	
	public void lanzarVentanaPorCodigo(View v) {
		Intent inten = new Intent(this, abriendoPorCodigo.class);
		startActivity(inten);
	}
}

package com.rogama.ejemplograficos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.Menu;
import android.view.View;

public class EjemploGraficosActivity extends Activity {

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		
		return true;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void Ejemplo1(View view) {
		Intent intent = new Intent(this, Ejemplo1.class);
		startActivity(intent);
	}
	
	public void Ejemplo2(View view) {
		Intent intent = new Intent(this, Ejemplo2.class);
		startActivity(intent);
	}
	public void Ejemplo3(View view) {
		Intent intent = new Intent(this, Ejemplo3.class);
		startActivity(intent);
	}
	
	public void Ejemplo4(View view) {
		Intent intent = new Intent(this, Ejemplo4.class);
		startActivity(intent);
	}
}

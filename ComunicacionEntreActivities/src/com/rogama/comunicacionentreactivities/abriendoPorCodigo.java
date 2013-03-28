package com.rogama.comunicacionentreactivities;

import com.rogama.comunicacionentreactivities.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class abriendoPorCodigo extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abriendoporcodigo);
		
		Bundle extras = getIntent().getExtras();
		String nombre = extras.getString("nombre");
		String edad = extras.getString("edad");
		
		TextView label = (TextView) findViewById(R.id.txtVMuestra);
		label.setText("Nombre: " + nombre + ", Edad: " + edad);
		
		String textResultado ="Recibido: " + label.getText();
		
		Intent intent = new Intent();//creamos una nueva intencion
		intent.putExtra("resultado",textResultado);//le damos el extra resultado y su valor
		setResult(RESULT_OK, intent);
		//finish();//cerramos esta ventana
	}
	
	

}

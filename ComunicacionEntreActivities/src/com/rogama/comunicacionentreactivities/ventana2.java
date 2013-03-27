package com.rogama.comunicacionentreactivities;

import com.rogama.comunicacionentreactivities.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class ventana2 extends Activity{

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ventana2);
		
		//recuperamos los valores pasados por el formulario anterior
		Bundle extras = getIntent().getExtras();
		String nombre = extras.getString("usuario");
		int edad = extras.getInt("edad");
	
		//creamos los botones
		EditText textNombre = (EditText) findViewById(R.id.TxtNombre);
		EditText textEdad = (EditText) findViewById(R.id.txtEdad);
		
		textNombre.setText(nombre);//asignamos el valor del nombre al text
		textEdad.setText(Integer.toString(edad));//convertimos el dato de la edad a string para poderlo asignar al text
	}

	
}

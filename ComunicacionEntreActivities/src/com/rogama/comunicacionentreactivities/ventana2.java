package com.rogama.comunicacionentreactivities;

import com.rogama.comunicacionentreactivities.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ventana2 extends Activity{

	//creamos los botones
	EditText textNombre;
	EditText textEdad;
		
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ventana2);
		
		//recuperamos los valores pasados por el formulario anterior
		Bundle extras = getIntent().getExtras();
		String nombre = extras.getString("usuario");
		int edad = extras.getInt("edad");
		
		textNombre = (EditText) findViewById(R.id.TxtNombre);
		textEdad = (EditText) findViewById(R.id.txtEdad);
		
		textNombre.setText(nombre);//asignamos el valor del nombre al text
		textEdad.setText(Integer.toString(edad));//convertimos el dato de la edad a string para poderlo asignar al text
		}

	public void enviarConRespuesta(View view) {
		Intent intent= new Intent(this, abriendoPorCodigo.class);
		
		intent.putExtra("nombre", textNombre.getText().toString());//añadimos estos valores asignados en el textBox, por lo que han podido cambiar desde el anterior
		intent.putExtra("edad", textEdad.getText().toString());
		startActivityForResult(intent, 0000);//lanzamos la Intencion que acabamos de crear, pero en modo espera de resultados, y le damos un codigo nuestro
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {//Sobre escribimos el motodo
		if (requestCode == 0000 && resultCode ==RESULT_OK){//en caso de que la respuesta sea para nosotros y sea positiva actuamos
			String resultado = data.getExtras().getString("resultado"); // recuperamos el valor devuelto en el extra resultado
			
			Toast toast = Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG);//creamos un mensaje emergente con el resultado
			toast.show();//mostramos el mensaje emergente
		}
	}
}

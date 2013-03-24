package com.rogama.ejemplos.masvistas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasVistasActivity extends Activity {
	private EditText entrada;
	private TextView salida;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        entrada = (EditText)findViewById(R.id.entrada);
        salida = (TextView)findViewById(R.id.salida);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mas_vistas, menu);
        return true;
    }
    public void sePulsa(View view){
    	salida.setText(String.valueOf(
    			Float.parseFloat(entrada.getText().toString())*2.0));
    	//Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show(); //saca un mensaje que dice pulsando
    }
    
    public void sePulsa0(View view){
    	//entrada.setText(entrada.getText() + "0"); 
    	entrada.setText(entrada.getText() + (String)view.getTag()); //hacemos lo mismo, pero aqui enviamos el 0 desde la prpiedad tag del boton
    	
    }
}

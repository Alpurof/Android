package com.rogama.example.holamundo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        TextView texto2 = new TextView(this);
        texto2.setText("Hola!!, Android");
        texto2.setPadding(0, 50, 0, 0);
        texto2.setHeight(10);
        texto2.setId(640);

        setContentView(texto2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

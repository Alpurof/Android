package com.rogama.sensores;

import java.util.EventObject;
import java.util.List;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity implements SensorEventListener {

	private TextView salida;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		salida = (TextView) findViewById(R.id.salida);
		SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
		
		for (Sensor sensor:listaSensores) {
			log(sensor.getName());
		}
		
		listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);
		if(!listaSensores.isEmpty()){
			Sensor orientacionSensor = listaSensores.get(0);
			sensorManager.registerListener( this, orientacionSensor, sensorManager.SENSOR_DELAY_UI);
		}
		
		listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
		if(!listaSensores.isEmpty()){
			Sensor acelerometerSensor = listaSensores.get(0);
			sensorManager.registerListener(this, acelerometerSensor, sensorManager.SENSOR_DELAY_UI);
		}
		
		listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);
		if(!listaSensores.isEmpty()){
			Sensor magneticSensor = listaSensores.get(0);
			sensorManager.registerListener(this, magneticSensor, sensorManager.SENSOR_DELAY_UI);
		}
		
		listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);
		if(!listaSensores.isEmpty()){
			Sensor temperatureSensor = listaSensores.get(0);
			sensorManager.registerListener(this, temperatureSensor, sensorManager.SENSOR_DELAY_UI);
		}
	}

	private void log(String name) {
		salida.append(name + "\n");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
		
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent evento) {
		synchronized (this) {
			switch (evento.sensor.getType()) {
			case Sensor.TYPE_ORIENTATION:
				for (int i = 0; i < 3; i++) {
					log("Orientacion " + i + ": " + evento.values[i]);
				}
				break;
			case Sensor.TYPE_ACCELEROMETER:
				for (int i = 0; i < 3; i++) {
					log("Acelerometro " + i + ": " + evento.values[i]);
				}
				break;
			case Sensor.TYPE_MAGNETIC_FIELD:
				for (int i = 0; i < 3; i++) {
					log("Magnetismo " + i + ": " + evento.values[i]);
				}
				break;
			default:
				for (int i = 0; i < 3; i++) {
					log("Temperatura " + i + ": " + evento.values[i]);
				}
				break;
			}
		}
		
	}

}

package com.rogama.ejemplograficos;

import com.rogama.ejemplograficos.Ejemplo2.EjemploView2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class Ejemplo3 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new EjemploView3(this));
	}

	public class EjemploView3 extends View {
		public EjemploView3(Context context) {
			super(context);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			Path trazo = new Path();
			trazo.moveTo(50, 100);
			trazo.cubicTo(60, 70, 150, 65, 200, 110);
			trazo.lineTo(300, 200);
			canvas.drawColor(Color.WHITE);
			Paint pincel = new Paint();
			pincel.setColor(Color.BLUE);
			pincel.setStrokeWidth(8);
			pincel.setStyle(Style.STROKE);
			canvas.drawPath(trazo, pincel);
			
			pincel.setStrokeWidth(1);
			pincel.setStyle(Style.FILL);
			pincel.setTextSize(20);
			pincel.setTypeface(Typeface.SANS_SERIF);
			canvas.drawTextOnPath("Desarrollo de aplicaciones para móviles con Android", trazo, 20, -30, pincel);
			
		}
		
	}
}

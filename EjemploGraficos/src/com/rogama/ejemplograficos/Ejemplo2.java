package com.rogama.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class Ejemplo2 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new EjemploView2(this));
	}
	public class EjemploView2 extends View {
		public EjemploView2(Context context) {
			super(context);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			Path trazo = new Path();
			trazo.addCircle(150, 150, 100, Direction.CW);
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

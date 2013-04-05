package com.rogama.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class Ejemplo4 extends Activity{

	private Drawable miImagen;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new EjemploView4(this));
	}

	public class EjemploView4 extends View {
		public EjemploView4(Context context) {
			super(context);
			Resources res = context.getResources();
			miImagen = res.getDrawable(R.drawable.mi_imagen);
			miImagen.setBounds(30, 30, 200, 200);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			miImagen.draw(canvas);
		}
		
	}
}

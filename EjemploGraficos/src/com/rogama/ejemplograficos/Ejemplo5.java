package com.rogama.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;

public class Ejemplo5 extends Activity{

	private ShapeDrawable miImagen;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new EjemploView4(this));
	}

	public class EjemploView4 extends View {
		public EjemploView4(Context context) {
			super(context);
			miImagen = new ShapeDrawable(new OvalShape());
			miImagen.getPaint().setColor(0xff0000ff);
			miImagen.setBounds(10,10,310,60);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			miImagen.draw(canvas);
		}
		
	}
}

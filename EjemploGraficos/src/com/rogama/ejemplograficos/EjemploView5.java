package com.rogama.ejemplograficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;

public class EjemploView5 extends View {
	private ShapeDrawable miImagen;
	public EjemploView5(Context context) {
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

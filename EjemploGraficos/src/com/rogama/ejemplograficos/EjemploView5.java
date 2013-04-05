package com.rogama.ejemplograficos;

import java.text.AttributedCharacterIterator.Attribute;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

public class EjemploView5 extends View {
	private ShapeDrawable miImagen;
	
	public EjemploView5(Context context, AttributeSet attrs) {
		super(context,attrs);
		miImagen = new ShapeDrawable(new OvalShape());
		miImagen.getPaint().setColor(0xff0000ff);
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		miImagen.draw(canvas);
	}

	@Override
	protected void onSizeChanged(int ancho, int alto, int oldw, int oldh) {
		// TODO Auto-generated method stub
		miImagen.setBounds(0,0,ancho,alto);
	}

}

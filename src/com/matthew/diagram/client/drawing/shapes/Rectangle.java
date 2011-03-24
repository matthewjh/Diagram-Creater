package com.matthew.diagram.client.drawing.shapes;

import com.matthew.diagram.client.drawing.DrawingSurface;
import com.matthew.diagram.client.drawing.Vector;

public class Rectangle extends Shape {

	public Rectangle(Vector coordinate, double height, double width) {
		setCoordinate(coordinate);
		setHeight(height);
		setWidth(width);
	}

	@Override
	public void draw(DrawingSurface surface) {
		
	}
}

package com.matthew.diagram.client.drawing.shapes;

import com.matthew.diagram.client.drawing.Vector;


public class Square extends Rectangle {
	
	private double sideLength;

	public Square(Vector coordinate, double sideLength) {
		super(coordinate, sideLength, sideLength);
	}

	@Override
	public void setHeight(double height) {
		setSideLength(height);
	}

	@Override
	public void setWidth(double width) {
		setSideLength(width);
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		super.setHeight(sideLength);
		super.setWidth(sideLength);
		this.sideLength = sideLength;
	}
}

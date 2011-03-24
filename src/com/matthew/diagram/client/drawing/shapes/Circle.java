package com.matthew.diagram.client.drawing.shapes;

import com.matthew.diagram.client.drawing.DrawingSurface;
import com.matthew.diagram.client.drawing.Vector;

public class Circle extends Shape {
	private double radius;
	private Vector center;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Vector getCenter() {
		return center;
	}
	public void setCenter(Vector center) {
		this.center = center;
	}
	
	public Circle(Vector center, double radius) {
		this.radius = radius;
		this.center = center;
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		super.setWidth(height);
		setRadius(height/2);
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		super.setHeight(width);
		setRadius(width/2);
	}
	
	@Override
	public void draw(DrawingSurface surface) {
		// TODO Auto-generated method stub
		
	}
}

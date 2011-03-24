package com.matthew.diagram.client.drawing.shapes;

import com.matthew.diagram.client.drawing.DrawingSurface;
import com.matthew.diagram.client.drawing.Vector;

public class Ellipse extends Shape {
	private double majorRadius;
	private double minorRadius;
	private Vector center;
	
	public double getMajorRadius() {
		return majorRadius;
	}
	public void setMajorRadius(double majorRadius) {
		this.majorRadius = majorRadius;
	}
	public double getMinorRadius() {
		return minorRadius;
	}
	public void setMinorRadius(double minorRadius) {
		this.minorRadius = minorRadius;
	}
	public Vector getCenter() {
		return center;
	}
	public void setCenter(Vector center) {
		this.center = center;
	}
	
	public Ellipse(double majorRadius, double minorRadius, Vector center) {
		super();
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
		this.center = center;
	}
	
	@Override
	public void draw(DrawingSurface surface) {
		// TODO Auto-generated method stub
		
	}
}

package com.matthew.diagram.client.drawing.shapes;

import com.matthew.diagram.client.drawing.Drawable;
import com.matthew.diagram.client.drawing.Vector;

public abstract class Shape implements Drawable {
	private Vector coordinate;
	private double height;
	private double width;

	public Vector getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Vector coordinate) {
		this.coordinate = coordinate;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public void translate(double x, double y) {
		this.coordinate.setX(this.coordinate.getX() + x);
		this.coordinate.setY(this.coordinate.getY() + y);
	}

	public Rectangle getBoundingRect() {
		return new Rectangle(getCoordinate(), getHeight(), getWidth());
	}
	
	/**
	 * Check whether this shape intersects another shape.
	 * @return <code>true</code> if both shapes intersect, 
	 * <code>false</code> otherwise.
	 */
	public boolean intersects(Shape s) {
		Rectangle boundingRect1 = this.getBoundingRect();
		Rectangle boundingRect2 = s.getBoundingRect();
		
		Vector rect1Corner1 = boundingRect1.getCoordinate();
		Vector rect1Corner2 = new Vector(rect1Corner1.getX() + boundingRect1.getWidth(), rect1Corner1.getY());
		Vector rect1Corner3 = new Vector(rect1Corner1.getX(), rect1Corner1.getY() + boundingRect1.getHeight());
		Vector rect2Corner1 = boundingRect2.getCoordinate();
		Vector rect2Corner2 = new Vector(rect2Corner1.getX() + boundingRect2.getWidth(), rect2Corner1.getY());
		Vector rect2Corner3 = new Vector(rect2Corner1.getX(), rect2Corner1.getY() + boundingRect2.getHeight());
		
		if ((rect1Corner1.getX() <= rect2Corner2.getX()) && (rect1Corner1.getX() >= rect2Corner1.getX()) &&
				(rect1Corner1.getY() <= rect2Corner3.getY()) && (rect1Corner1.getY() >= rect2Corner1.getY())) {
			return true;
		} else if ((rect1Corner2.getX() >= rect2Corner1.getX()) && (rect1Corner2.getX() <= rect2Corner2.getX()) &&
				(rect1Corner2.getY() >= rect2Corner1.getY()) && (rect1Corner2.getY() <= rect2Corner3.getY())) {
			return true;
		} else if ((rect2Corner1.getX() <= rect1Corner2.getX()) && (rect2Corner1.getX() >= rect1Corner1.getX()) &&
				(rect2Corner1.getY() <= rect1Corner3.getY()) && (rect2Corner1.getY() >= rect1Corner1.getY())) {
			return true;
		} else if ((rect2Corner2.getX() >= rect1Corner1.getX()) && (rect2Corner2.getX() <= rect1Corner2.getX()) &&
				(rect2Corner2.getY() >= rect1Corner1.getY()) && (rect2Corner2.getY() <= rect1Corner3.getY())) {
			return true;
		} else if ((rect1Corner1.getX() >= rect2Corner1.getX()) && (rect1Corner1.getX() <= rect2Corner2.getX()) &&
				(rect1Corner3.getY() >= rect2Corner3.getY()) && (rect1Corner1.getY() <= rect2Corner1.getY())) {
			return true;
		} else if ((rect2Corner1.getX() >= rect1Corner1.getX()) && (rect2Corner1.getX() <= rect1Corner2.getX()) &&
				(rect2Corner3.getY() >= rect1Corner3.getY()) && (rect2Corner1.getY() <= rect1Corner1.getY())) {
			return true;
		}
		
		return false;
	}
}

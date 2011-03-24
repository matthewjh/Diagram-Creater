package com.matthew.diagram.client.drawing;

/**
 * Class for representing a 2D Vector.
 * @author Matthew J Hill
 *
 */
public class Vector {
	private double x;
	private double y;
	
	/**
	 * Create a vector with x=0, y=0.
	 */
	public static Vector Zero() {
		return new Vector(0, 0);
	}
	
	public Vector(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Multiply to the x and y components of this vector.
	 */
	public void multiply(double x, double y) {
		this.x *= x;
		this.y *= y;
	}
	
	/**
	 * Multiply two vectors.
	 * @param v The vector to multiply to this vector with.
	 */
	public void multiply(Vector v) {
		multiply(v.getX(), v.getY());
	}
	
	/**
	 * Add to the x and y components of this vector.
	 */
	public void add(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	/**
	 * Add two vectors.
	 * @param v The vector to add to this vector.
	 */
	public void add(Vector v) {
		add(v.getX(), v.getY());
	}
	
	/**
	 * Subtract from the x and y components of this vector.
	 */
	public void subtract(double x, double y) {
		this.x -= x;
		this.y -= y;
	}
	
	/**
	 * Subtract two vectors.
	 * @param v The vector to subtract from this vector.
	 */
	public void subtract(Vector v) {
		subtract(v.getX(), v.getY());
	}
	
	/**
	 * Calculate the magnitude of the vector. A^2 + B^2 = C^2
	 */
	public double magnitude() {
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
	}

	@Override
	public boolean equals(Object obj) {
		Vector vector = (Vector) obj;
			
		if (this.getX() == vector.getX() && this.getY() == vector.getY()) {
			return true;
		}
		
		return super.equals(obj);
	}

}

package com.matthew.diagram.client;

import junit.framework.Assert;

import org.junit.Test;

import com.matthew.diagram.client.drawing.Vector;


public class VectorTest {
	
	@Test
	public void VectorConstructor_SetsCorrectXAndYValues() {
		Vector vector = new Vector(2, 5);
		
		Assert.assertEquals(2.0, vector.getX());
		Assert.assertEquals(5.0, vector.getY());
	}
	
	@Test
	public void VectorZero_ReturnsZeroVector() {
		Vector vector = Vector.Zero();
		
		Assert.assertEquals(0.0, vector.getX());
		Assert.assertEquals(0.0, vector.getY());
	}
	
	@Test
	public void VectorAdd_WithXY_SetsCorrectXAndYValues() {
		Vector vector = new Vector(0, 0);
		
		vector.add(2, 3);
		vector.add(1, 1);
		
		Assert.assertEquals(3.0, vector.getX());
		Assert.assertEquals(4.0, vector.getY());
	}
	
	@Test
	public void VectorAdd_WithVector_SetsCorrectXAndYValues() {
		Vector vector1 = new Vector(3, 4);
		Vector vector2 = new Vector(5, 2);
		
		vector1.add(vector2);
		
		Assert.assertEquals(8.0, vector1.getX());
		Assert.assertEquals(6.0, vector1.getY());
	}
	
	@Test
	public void VectorMultiply_WithXY_SetsCorrectXAndYValues() {
		Vector vector = new Vector(2, 6);
		
		vector.multiply(2, 3);
		vector.multiply(1, 4);
		
		Assert.assertEquals(4.0, vector.getX());
		Assert.assertEquals(72.0, vector.getY());
	}
	
	@Test
	public void VectorMultiply_WithVector_SetsCorrectXAndYValues() {
		Vector vector1 = new Vector(3, 4);
		Vector vector2 = new Vector(5, 2);
		
		vector1.multiply(vector2);
		
		Assert.assertEquals(15.0, vector1.getX());
		Assert.assertEquals(8.0, vector1.getY());
	}
	
	@Test
	public void VectorSubtract_WithXY_SetsCorrectXAndYValues() {
		Vector vector = new Vector(0, 0);
		
		vector.subtract(5, 2);
		vector.subtract(2, 8);
		
		Assert.assertEquals(-7.0, vector.getX());
		Assert.assertEquals(-10.0, vector.getY());
	}
	
	@Test
	public void VectorSubtract_WithVector_SetsCorrectXAndYValues() {
		Vector vector1 = new Vector(4, 3);
		Vector vector2 = new Vector(3, 5);
		
		vector1.subtract(vector2);
		
		Assert.assertEquals(1.0, vector1.getX());
		Assert.assertEquals(-2.0, vector1.getY());
	}
	
	@Test
	public void VectorEquals_DoesCorrectComparisonOfXAndYComponents() {
		Vector vector1 = new Vector(4, 8);
		Vector vector2 = new Vector(4, 8);
		
		Assert.assertTrue(vector1.equals(vector2));
		Assert.assertTrue(vector2.equals(vector1));
	}
	
	@Test
	public void VectorMaginitude_CalculatesCorrectMagnitude() {
		Vector vector = new Vector(8, 15);
		
		Assert.assertEquals(17.0, vector.magnitude());
	}
}

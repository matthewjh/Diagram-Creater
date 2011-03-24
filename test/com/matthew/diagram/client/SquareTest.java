package com.matthew.diagram.client;

import junit.framework.Assert;

import org.junit.Test;

import com.matthew.diagram.client.drawing.Vector;
import com.matthew.diagram.client.drawing.shapes.Square;


public class SquareTest {
	
	@Test
	public void SquareSetWidth_MaintainsSquareness() {
		Square square = new Square(Vector.Zero(), 10);
		
		square.setWidth(5);
		
		Assert.assertEquals(5.0, square.getWidth());
		Assert.assertEquals(5.0, square.getHeight());
	}
	
	@Test
	public void SquareSetHeight_MaintainsSquareness() {
		Square square = new Square(Vector.Zero(), 10);
		
		square.setHeight(5);
		
		Assert.assertEquals(5.0, square.getWidth());
		Assert.assertEquals(5.0, square.getHeight());
	}
	
	@Test
	public void SquareSetSideLength_MaintainsSquareness() {
		Square square = new Square(Vector.Zero(), 10);
		
		square.setSideLength(5);
		
		Assert.assertEquals(5.0, square.getWidth());
		Assert.assertEquals(5.0, square.getHeight());
		Assert.assertEquals(5.0, square.getSideLength());
	}
}

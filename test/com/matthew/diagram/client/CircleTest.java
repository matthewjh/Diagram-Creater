package com.matthew.diagram.client;

import junit.framework.Assert;

import org.junit.Test;

import com.matthew.diagram.client.drawing.Vector;
import com.matthew.diagram.client.drawing.shapes.Circle;


public class CircleTest {

	@Test
	public void CircleSetWidth_MaintainsCircularity() {
		Circle circle = new Circle(Vector.Zero(), 5);		
		circle.setWidth(50);
		
		Assert.assertEquals(50.0, circle.getHeight());
		Assert.assertEquals(50.0, circle.getWidth());
	}
	
	@Test
	public void CircleSetHeight_MaintainsCircularity() {
		Circle circle = new Circle(Vector.Zero(), 5);		
		circle.setHeight(50);
		
		Assert.assertEquals(50.0, circle.getHeight());
		Assert.assertEquals(50.0, circle.getWidth());
	}
	
	@Test
	public void CircleSetWidth_SetsCorrectRadius() {
		Circle circle = new Circle(Vector.Zero(), 5);		
		circle.setWidth(50);
		
		Assert.assertEquals(25.0, circle.getRadius());
	}
	
	@Test
	public void CircleSetHeight_SetsCorrectRadius() {
		Circle circle = new Circle(Vector.Zero(), 5);		
		circle.setHeight(50);
		
		Assert.assertEquals(25.0, circle.getRadius());
	}
}

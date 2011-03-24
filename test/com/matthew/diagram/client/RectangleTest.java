package com.matthew.diagram.client;

import org.junit.Assert;
import org.junit.Test;

import com.matthew.diagram.client.drawing.Vector;
import com.matthew.diagram.client.drawing.shapes.Rectangle;


public class RectangleTest {
	@Test
	public void RectangleIntersects_ReturnsTrueForIntersectingRectanglePair1() {
		Rectangle rect1 = new Rectangle(Vector.Zero(), 10, 10);
		Rectangle rect2 = new Rectangle(new Vector(5, 5), 50, 50);
		
		Assert.assertTrue(rect1.intersects(rect2));
		Assert.assertTrue(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsTrueForIntersectingRectanglePair2() {
		Rectangle rect3 = new Rectangle(new Vector(0, 10), 10, 20);
		Rectangle rect4 = new Rectangle(new Vector(3, 5), 5, 30);
		
		Assert.assertTrue(rect3.intersects(rect4));
		Assert.assertTrue(rect4.intersects(rect3));
	}
	
	@Test
	public void RectangleIntersects_ReturnsTrueForIntersectingRectanglePair3() {
		Rectangle rect5 = new Rectangle(Vector.Zero(), 50, 100);
		Rectangle rect6 = new Rectangle(new Vector(20, 20), 10, 10);
		
		Assert.assertTrue(rect5.intersects(rect6));
		Assert.assertTrue(rect6.intersects(rect5));
	}
	
	@Test 
	public void RectangleIntersects_ReturnsTrueForIntersectingRectanglePair4() {
		Rectangle rect1 = new Rectangle(new Vector(0, 10), 10, 20);
		Rectangle rect2 = new Rectangle(new Vector(14, 15), 5, 2);
		
		Assert.assertTrue(rect1.intersects(rect2));
		Assert.assertTrue(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsTrueForIntersectingRectanglePair5() {
		Rectangle rect1 = new Rectangle(new Vector(25, 5), 100, 5);
		Rectangle rect2 = new Rectangle(new Vector(0, 20), 5, 50);
		
		Assert.assertTrue(rect1.intersects(rect2));
		Assert.assertTrue(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsTrueForIntersectingRectanglePair6() {
		Rectangle rect1 = new Rectangle(new Vector(5, 5), 100, 200);
		Rectangle rect2 = new Rectangle(new Vector(3, 30), 10, 400);
		
		Assert.assertTrue(rect1.intersects(rect2));
		Assert.assertTrue(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsFalseForNonIntersectingRectanglePair1() {
		Rectangle rect1 = new Rectangle(Vector.Zero(), 50, 50);
		Rectangle rect2 = new Rectangle(new Vector(100, 500), 100, 50);
		
		Assert.assertFalse(rect1.intersects(rect2));
		Assert.assertFalse(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsFalseForNonIntersectingRectanglePair2() {
		Rectangle rect1 = new Rectangle(new Vector(400, 800), 5, 201);
		Rectangle rect2 = new Rectangle(new Vector(4000, 1000), 15, 2);
		
		Assert.assertFalse(rect1.intersects(rect2));
		Assert.assertFalse(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsFalseForNonIntersectingRectanglePair3() {
		Rectangle rect1 = new Rectangle(Vector.Zero(), 5, 5);
		Rectangle rect2 = new Rectangle(new Vector(6, 6), 5, 5);
		
		Assert.assertFalse(rect1.intersects(rect2));
		Assert.assertFalse(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsFalseForNonIntersectingRectanglePair4() {
		Rectangle rect1 = new Rectangle(Vector.Zero(), 5, 5);
		Rectangle rect2 = new Rectangle(new Vector(0, 6), 5, 5);
		
		Assert.assertFalse(rect1.intersects(rect2));
		Assert.assertFalse(rect2.intersects(rect1));
	}
	
	@Test
	public void RectangleIntersects_ReturnsFalseForNonIntersectingRectanglePair5() {
		Rectangle rect1 = new Rectangle(Vector.Zero(), 5, 5);
		Rectangle rect2 = new Rectangle(new Vector(6, 0), 5, 5);
		
		Assert.assertFalse(rect1.intersects(rect2));
		Assert.assertFalse(rect2.intersects(rect1));
	}
}

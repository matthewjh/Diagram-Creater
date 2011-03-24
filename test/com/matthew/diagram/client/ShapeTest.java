package com.matthew.diagram.client;

import junit.framework.Assert;

import org.junit.Test;

import com.matthew.diagram.client.drawing.DrawingSurface;
import com.matthew.diagram.client.drawing.Vector;
import com.matthew.diagram.client.drawing.shapes.Rectangle;
import com.matthew.diagram.client.drawing.shapes.Shape;


public class ShapeTest {
	
	/**
	 * Straight-up Shape base-class that we can test the 
	 * non-abstract methods of the Shape class.
	 * @author Matthew J Hill
	 *
	 */
	public class ConcreteShape extends Shape {
		
		public ConcreteShape(Vector coordinate, double height, double width) {
			setCoordinate(coordinate);
			setHeight(height);
			setWidth(width);
		}

		@Override
		public void draw(DrawingSurface surface) {
		}
	}
	
	@Test
	public void ShapeTranslate_TranslatesCoordinatesCorrectly() {
		ConcreteShape shape = new ConcreteShape(Vector.Zero(), 50, 50);
		shape.translate(50, 10);
		shape.translate(2, 1);
		
		Assert.assertEquals(52.0, shape.getCoordinate().getX());
		Assert.assertEquals(11.0, shape.getCoordinate().getY());
	}
	
	@Test
	public void ShapeGetBoundingRect_BoundingRectHasCorrectCoordinate() {
		ConcreteShape shape = new ConcreteShape(new Vector(5, 2), 50, 10);
		Rectangle boundingRect = shape.getBoundingRect();
		
		Assert.assertEquals(new Vector(5, 2), boundingRect.getCoordinate());
	}
	
	@Test
	public void ShapeGetBoundingRect_BoundingRectHasCorrectHeight() {
		ConcreteShape shape = new ConcreteShape(new Vector(5, 2), 50, 10);
		Rectangle boundingRect = shape.getBoundingRect();
		
		Assert.assertEquals(50.0, boundingRect.getHeight());
	}
	
	@Test
	public void ShapeGetBoundingRect_BoundingRectHasCorrectWidth() {
		ConcreteShape shape = new ConcreteShape(new Vector(5, 2), 50, 10);
		Rectangle boundingRect = shape.getBoundingRect();
		
		Assert.assertEquals(10.0, boundingRect.getWidth());
	}

}

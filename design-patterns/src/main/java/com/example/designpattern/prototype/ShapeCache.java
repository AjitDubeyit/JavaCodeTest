package com.example.designpattern.prototype;

import java.util.Hashtable;



public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape)cachedShape.clone();
	}
	
	public static void loadCache() {
		Circle c = new Circle();
		c.setId("1");
		shapeMap.put(c.getId(), c);
		
		Square s = new Square();
		s.setId("2");
		shapeMap.put(s.getId(), s);
		
		Rectangle r = new Rectangle();
		r.setId("3");
		shapeMap.put(r.getId(), r);
	}
	
	
}

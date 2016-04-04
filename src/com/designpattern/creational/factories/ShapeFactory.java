package com.designpattern.creational.factories;

import com.designpattern.creational.implementations.Circle;
import com.designpattern.creational.implementations.Rectangle;
import com.designpattern.creational.implementations.Square;
import com.designpattern.creational.interfaces.Shape;

public class ShapeFactory {
	public Shape getShape(String typeShape){
		
		if (typeShape == null){
			return null;
		}
		
		if (typeShape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		
		if (typeShape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		
		if (typeShape.equalsIgnoreCase("Square")){
			return new Square();
		}
		
		return null;
	}
}

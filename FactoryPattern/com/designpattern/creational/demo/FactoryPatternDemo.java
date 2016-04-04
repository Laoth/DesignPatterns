package com.designpattern.creational.demo;

import com.designpattern.creational.factories.ShapeFactory;
import com.designpattern.creational.implementations.Circle;
import com.designpattern.creational.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = factory.getShape("RECTANGLE");
		rectangle.draw();
		
		Shape square = factory.getShape("SQUARE");
		square.draw();
		
		

	}

}

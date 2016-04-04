package com.designpattern.creational.implementations;

import com.designpattern.creational.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

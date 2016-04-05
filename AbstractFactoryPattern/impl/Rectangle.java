package impl;
import inter.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw() method inside");
	}

}

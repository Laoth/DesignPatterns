package impl;
import inter.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw() method inside");
	}

}

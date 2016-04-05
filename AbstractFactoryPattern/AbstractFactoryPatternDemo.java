

import abstractfactory.AbstractFactory;
import interfaces.Color;
import interfaces.Shape;
import producer.FactoryProducer;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Color red = colorFactory.getColor("RED");
		red.fill();
	}

}

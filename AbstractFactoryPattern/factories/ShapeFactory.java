package factories;

import abstractfactory.AbstractFactory;
import impl.Circle;
import impl.Rectangle;
import impl.Square;
import inter.Color;
import inter.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String typeShape) {
		if(typeShape == null){
			return null;
		}
		
		if (typeShape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		
		if (typeShape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		
		if (typeShape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String typeColor) {
		return null;
	}
	
}

package factory;

import implementations.Circle;
import implementations.Rectangle;
import implementations.Square;
import inter.Shape;

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

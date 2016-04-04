package factories;

import abstractfactory.AbstractFactory;
import impl.Blue;
import impl.Green;
import impl.Red;
import interfaces.Color;
import interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String typeShape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String typeColor) {
		if (typeColor == null){
			return null;
		}
		
		if (typeColor.equalsIgnoreCase("RED")){
			return new Red();
		}
		
		if (typeColor.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		
		if (typeColor.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}
	
}

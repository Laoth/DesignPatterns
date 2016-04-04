package abstractfactory;

import interfaces.Color;
import interfaces.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String typeShape);
	public abstract Color getColor(String typeColor);
}

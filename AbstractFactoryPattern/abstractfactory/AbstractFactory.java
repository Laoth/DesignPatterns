package abstractfactory;

import inter.Color;
import inter.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String typeShape);
	public abstract Color getColor(String typeColor);
}

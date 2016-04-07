package impl;

import abstracts.ColdDrink;

public class CokeDrink extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}


	@Override
	public float price() {
		return 30.0f;
	}

}

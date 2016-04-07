package concrete;

import impl.ChickenBurger;
import impl.CokeDrink;
import impl.PepsiDrink;
import impl.VegBurger;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new PepsiDrink());
		return meal;
	}
	
	public Meal prepareNoVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new CokeDrink());
		return meal;
	}
}

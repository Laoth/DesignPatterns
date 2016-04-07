import concrete.Meal;
import concrete.MealBuilder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		
		Meal noVegMeal = builder.prepareNoVegMeal();
		noVegMeal.showItems();
		
		Meal vegMeal = builder.prepareVegMeal();
		vegMeal.showItems();

	}

}

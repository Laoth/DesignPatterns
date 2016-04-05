import object.SingleObject;

public class SingletonPatternDemo {
	public static void main (String args []){

		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		object.getMessage();
	}
}

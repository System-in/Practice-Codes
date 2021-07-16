

//ArrayList = a resizable array.
//			  Elements can be added and removed after compilation phase
//			  Stores Reference data types
import java.util.ArrayList;
public class Prog2 {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Burger");
		food.add("Hotdog");
		
		for(int i=0; i<food.size();i++) {
			System.out.println(food.get(i));
			//for array we use .length();
			//for Arraylist we use .get();
		}
		
		//some of the useful methods are :
		/* .set();
		 * .remove();
		 * .get();
		 * .clear();
		 * 
		 */
				
	}

}

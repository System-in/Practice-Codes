import java.util.ArrayList;

/*for each loop -> traversing technique to iterate through the elements in an array
 * 					less steps, more readable 
 * 					less flexible
 */


public class Prog3 {

	public static void main(String[] args) {
		
		ArrayList<String> food= new ArrayList<String>();
		//String[] animals= {"Cat","Dog","Bird"};
		food.add("Coke");
		food.add("Bread");
		food.add("Butter");
		for(String i : food) {
			System.out.println(i);
		}
		
	}

}

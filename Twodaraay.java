//2D Array- an array of array
public class Twodaraay {

	public static void main(String[] args) {
		String[][] cars = new String[3][3];
		cars[0][0]="Tesla";
		cars[0][1]="Tata";
		cars[0][2]="Ford";
		
		cars[1][0]="Audi";
		cars[1][1]="BMW";
		cars[1][2]="Ferrari";
		
		cars[2][0]="Lambo";
		cars[2][1]="Toyota";
		cars[2][2]="Premio";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j] + "  ");
			}
		}
		

	}

}

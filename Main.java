//for loop - it executes a block of codes a limited amount of time
//nested loop- a loop inside of a loop 
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol= "";
		System.out.println("Enter the no of rows" );
		rows = scanner.nextInt();
		System.out.println("Enter the no of columns" );
		columns = scanner.nextInt();
		
		System.out.println("Which Symbol u wanna print");
		symbol = scanner.next();
		
		for(int i=1;i<=rows;i++) {
			System.out.println();
			for(int j=1;j<=columns;j++) {
				System.out.print(symbol);
			}
		}
		scanner.close();
		}

	}



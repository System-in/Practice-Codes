//counting
import java.util.Scanner;

public class Namta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			result = num*i;
			System.out.println(num + " X " + i + " = " + result);
		}
		sc.close();

	}

}


public class Prog5 {

	public static void main(String[] args) {
		//overloaded methods -> methods that share the same name but have differenet paramenters 
		//						method name + parameters = method signature
		int x = add(1,2);
		System.out.println(x);

	}
	public static int add(int a, int  b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	public static int add(int a , int b, int c) {
		System.out.println("This is overloaded method #2");
		return a+b+c;
	}

}

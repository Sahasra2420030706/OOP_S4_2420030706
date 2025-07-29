package operator;
import java.util.*;

public class arthmeticoperator {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("The sum of " +a+ "and" +b+ "is" +c);
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = d-e;
		System.out.println("The differece of " +d+ "and" +e+ "is" +f);
		int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z= x*y;
	    System.out.println("The product of " +x+ " and " +y+ " is " +z);
	    int k = sc.nextInt();
	    int l = sc.nextInt();
	    int m = k/l;
	    System.out.println("The quotient of " +k+ " and " +l+ " is " +m);
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    int r = p%q;
	    System.out.println("The remainder of " +p+ " and " +q+ " is " +r);
		

	}

}

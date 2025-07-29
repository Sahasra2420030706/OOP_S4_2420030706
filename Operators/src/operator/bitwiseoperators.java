package operator;

import java.util.Scanner;

public class bitwiseoperators {

	public static void main(String[] args) {
		// Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers.
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a & b;
		System.out.println("bitwise AND: " +a+ "&" +b+ "is " +c);
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = d|e;
		System.out.println("Bitwise OR:" +d+ "|" +e+ "is" +f);
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = g^h;
		System.out.println("Bitwise XOR:" +g+ "^" +h+ "is" +i);
		int j = sc.nextInt();
		int k = ~j;
		System.out.println( "Bitwise complement:" +j+ "is" +k);
			
	}

}

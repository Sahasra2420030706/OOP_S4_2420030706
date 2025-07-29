package operator;

import java.util.Scanner;

public class shifts {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a>>1;
		System.out.println("The right shift  will be " +b);
		int c = sc.nextInt();
		int d = c<<1;
		System.out.println("The left shift will be " +d);
		
	}
}

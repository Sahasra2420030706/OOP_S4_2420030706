package operator;

import java.util.Scanner;

public class compoundassignment {

	public static void main(String[] args) {
		// Demonstrate compound assignment operators on a number.
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+=b;
		System.out.println("The compund assignment of addition is " +c);
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = d-=e;
		System.out.println("The compund assignment of subtraction is " +f);
		
		
		

	}

}

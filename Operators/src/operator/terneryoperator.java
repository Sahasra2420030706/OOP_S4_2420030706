package operator;

import java.util.Scanner;

public class terneryoperator {

	public static void main(String[] args) {
		// Find the greater of two numbers using a ternary operator.
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a>b)?a:(b>a)?b:a;
		
		System.out.println("The greater number is " +c);
		
		

	}

}

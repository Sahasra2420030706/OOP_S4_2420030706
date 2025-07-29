package operator;

import java.util.Scanner;

public class comparisionoperator {

	public static void main(String[] args) {
		// Compare two integers and display which one is greater or if they are equal
		System.out.println("Enter two number");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		if(number1>number2) 
			System.out.println(number1+" is greater");
	
		else if(number1==number2)
			System.out.println("Both numbers are equal");
		else 
			System.out.println(number1+" is smaller");
	}

}

package operator;

import java.util.Scanner;

public class incrementdecrement {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = a++;
	System.out.println("The post increment will be " +b);
	int c = sc.nextInt();
	int d = ++c;
	System.out.println("The pre increment will be " +d);
	int e = sc.nextInt();
	int f = --e;
	System.out.println("The pre decrement will be " +f);
	int g= sc.nextInt();
	int h = g--;
	System.out.println("The post decrement will be " +h);
}

}

import java.util.Scanner;

import java.lang.Math;

public class Quadratic{


	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	double a;

	double b;

	double c;

	double firstRoot;

	double secondRoot;

	System.out.print("Enter integer for a: ");
	a = input.nextDouble();

	System.out.print("Enter integer for b: ");
	b = input.nextDouble();

	System.out.print("Enter integer for c: ");
	c = input.nextDouble();


	firstRoot = -b + Math.sqrt(Math.pow (b,2)) - (4 * a * b)/ (2 * a);

	System.out.printf("First Root equals: " + firstRoot + "\n");


	secondRoot = -b - Math.sqrt(Math.pow (b,2)) - (4 * a * b)/ (2 * a);

	System.out.printf("Second Root equals: " + secondRoot);


}
}

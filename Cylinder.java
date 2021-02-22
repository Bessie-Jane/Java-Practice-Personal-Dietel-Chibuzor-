import java.util.Scanner;

public class Cylinder{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	double area;
	double volume;
	double length;
	double radius;
	double pi = 3.142;

	System.out.println ("Input radius of Cylinder: ");
	radius = input.nextDouble();

	System.out.println ("Input length of Cylinder: ");
	length = input.nextDouble();

	area = pi * radius * radius;
	volume = area * length;

	System.out.printf ("The area is: " + area + "\n" );
	System.out.printf ("The volume is: " + volume + "\n");

	}

}
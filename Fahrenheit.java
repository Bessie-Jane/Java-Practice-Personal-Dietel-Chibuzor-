import java.util.Scanner;

public class Fahrenheit{

	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);

	double celcius;
	double fahrenheit;

	System.out.println ("Input a value in Celcius: ");
		celcius = input.nextDouble();
		
	fahrenheit = (9.0 / 5) * celcius + 32;

	System.out.println(fahrenheit);		
	

	}
	
	}
	
 

import java.util.Scanner;

public class Palindrome{

	public static void main(String[] args){

		
	Scanner input = new Scanner(System.in);
	
	int number;	
	System.out.print("Enter a number: ");
	number = input.nextInt();
	
	int firstDigit = number / 100;		
	int thirdDigit = number % 10;
	
	if(firstDigit == thirdDigit){
	System.out.print("This is a Palindrome");
	}

	if(firstDigit != thirdDigit){
	System.out.print("This is not a Palindrome!");
	}



}
	
}	

	
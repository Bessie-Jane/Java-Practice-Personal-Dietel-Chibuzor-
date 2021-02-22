import java.util.Scanner;

public class TelevisionTest{

	public static void main(String[] args){
	
	Television myTelevision = new Television("Moxie", "Black", 32, false, 10, 7);

	System.out.println("The name of my TV Set is " + myTelevision.getbrandName() + 
				" it is " + myTelevision.getColour() + " and it is " +
				 myTelevision.getlength() + " in length.");
	
	System.out.println("Right now, my TV is " + myTelevision.IsOn() + " meaning its off. " +
			 	"That is its default state.\n\n");

	Scanner input = new Scanner(System.in);	

	System.out.println("Now we want to test if its working.... Note: TRUE means ON while FALSE is OFF.");
	
	System.out.print("Enter input: ");
	Boolean userInput = input.nextBoolean();
	System.out.println("TV is " + userInput);

	System.out.print("Enter input: ");
	Boolean userValue = input.nextBoolean();
	System.out.println("TV is " + userValue);

	System.out.print("Enter input: ");
	int inputVolume = input.nexint();
	System.out.println("TV ")	

	//System.out.println("The default volume is" + myTelevision.getVolume());

	
	
	//myTelevision.setVolume();
	
	
	
	
	
	













}
	
}
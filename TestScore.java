import java.util.Scanner;

public class TestScore{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int normalScore = 40;
			
		int score;
		
		System.out.println("Enter test score: ");
			score = input.nextInt();
			
		
		if (score >= normalScore){
		
		System.out.println("Pass");
		
		}

		if (score < normalScore){
		
		System.out.println("Fail");
		}
	




}






}
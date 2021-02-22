
import java.util.Scanner;

public class StudentScore{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		double excellent = 90.0;
		double better    = 80.0;
		double good      = 70.0;
		
			
		double score;
		
		System.out.println("Enter test score: ");
			score = input.nextDouble();
			
		
		if (score >= excellent ){
		System.out.println("A");
			}
			
		if (score < excellent && score >= better){
		System.out.println("B");
			}
		
	
		if (score < better && score >= good){
		System.out.println("C");
			}		
			
		
		if (score < good){
		System.out.println("F");
			}


}

}
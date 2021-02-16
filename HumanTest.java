public class HumanTest{
	
	public static void main(String[] args){
	
	Human bessieThanks = new Human();
	
	System.out.printf("My name is %s%n", bessieThanks.getName());

	System.out.printf("I'm dead, it is %b%n", bessieThanks.isNotDead());
	
	bessieThanks.setIsAlive(true);

	System.out.printf("My dog is dead. it is %b%n", bessieThanks.isNotDead());	






	}
}
import java.util.Scanner;
       public class Guess{
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       int guess = 45;
       int userGuess;

       System.out.print("Enter number to guess");
       userGuess = input.nextInt();


       if(userGuess == guess){
       System.out.print("You Won!");
       }

       if (userGuess > guess){
       System.out.print("Wrong!...Too High");
       }

       if (userGuess < guess){ 
       System.out.print("Wrong!...Too Low");
       }

       }

       }



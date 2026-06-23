//Selecting the random number;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        //taking input from the user!!
        Scanner sc = new Scanner(System.in);

        //Genrating the Random number!!
        Random random = new Random();

        //generats the random number between 1 to 100 and stores it in the variable number!!
        int number = random.nextInt(100) + 1;

        //for guessing the number
        int guess;

        System.out.println("Welcome to Number Game!");
        System.out.println("Guess a number between 1 and 100");
        do{
            System.out.print("Enter your guess:");
            guess=sc.nextInt();

        if(guess>number){
            System.out.println("Too High!");
        }
        else if(guess<number){
            System.out.println("Too low!");
        }else{
            System.out.println("Correct!");
        }
    } 
     while(guess!=number);
    }
}

        
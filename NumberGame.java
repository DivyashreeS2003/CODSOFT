import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[]args){
        numberGame();
    }
    public static void numberGame(){
        int Score=0;
        boolean playAgain=true;
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        while(playAgain){
            System.out.println("Hello..,Welcome to the Number Game..!!");
            System.out.println("Generated the number between 1 to 100");
            int GeneratedNumber=random.nextInt(100)+1;
            int Attempts=0;
            System.out.println("Can you guess the number which is in my mind");

            while(true){
                System.out.print("Please enter your guess");
                int UserGuess=scanner.nextInt();
                Attempts++;

                if(UserGuess==GeneratedNumber){
                    System.out.println("Congratulations..!!!!, you guessed correctly");
                    Score++;
                    break;
                }else if(UserGuess<GeneratedNumber){
                    System.out.println("Ho no, its too low! Guess again.");
                }else{
                    System.out.println("Nope, its too high! Guess again.");
                }
                if(Attempts==4){
                    System.out.println("Sorry, you have the maximum number of attempts.");
                    System.out.println("The number guessed by me was"+GeneratedNumber+".");
                    break;
                }
            }

            System.out.print("Interested to play again??(yes/no):");
            String PlayAgain=scanner.next();

            if(!PlayAgain.equalsIgnoreCase("yes")){
                playAgain = false;
        }
        }

        System.out.println("YOUR FINAL SCORE IS:"+Score);

    }
}
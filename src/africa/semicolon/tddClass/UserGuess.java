import java.util.Scanner;
public class UserGuess{
    public static void main(String [] args){
        Scanner collector = new Scanner(System.in);
        System.out.println("You have three chances to guess it right.");
        int actualValue = 60;
        System.out.printf("Enter first guess:%n");
        int firstGuess = collector.nextInt();
        int proceed = 1;
        if(actualValue == firstGuess){
                proceed = 0;
                System.out.println("You guessed right... WELDONE!!");
            }
        if(proceed == 1){
            if(actualValue > firstGuess){
                
                System.out.println("guess is low!!; please try again");
            }
            if(actualValue < firstGuess){
                
                System.out.println("Guess is high... please try again");
            }
            System.out.printf("Enter second guess:%n");
            int secondGuess = collector.nextInt();
            if(actualValue > secondGuess){
                System.out.println("Oh no... the guess is low; please try again");
            }
            if(actualValue < secondGuess){
                System.out.println("Shit... it's a high guess! please try again");
            }
            if(actualValue == secondGuess){
                System.out.println("Great! weldone!!");
                proceed = 0;
            }
            if(proceed == 1){
                System.out.printf("Enter third guess:%n");
                int thirdGuess = collector.nextInt();
            if(actualValue > thirdGuess){
                System.out.println("Oh no... the guess is low\nNumber of trial completed!\nGAME OVER");
            }
            if(actualValue < thirdGuess){
                System.out.println("Shit... it's a high guess!\nNumber of trial completed!\nGAME OVER");
            }
            if(actualValue == thirdGuess){
                System.out.println("Great! weldone!!");
            }
        }
        }      
}
}

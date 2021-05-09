import java.util.Scanner;    
public class Multiples{
        public static void main(String [] args){
             Scanner getUserInput = new Scanner(System.in);
          System.out.println("Checking if a number is a multiple of another");

        System.out.println("Enter first number: ");
        int firstUserInput = getUserInput.nextInt();

        System.out.println("Enter second number: ");
        int secondUserInput = getUserInput.nextInt();
        
        if(firstUserInput % secondUserInput == 0){
            System.out.printf("%d%s%d%n", secondUserInput, " is a multiple of ", firstUserInput);
        }
        if(firstUserInput % secondUserInput != 0){
            System.out.printf("%d%s%d%n", secondUserInput, " is  not a multiple of ", firstUserInput);
        }
}
}

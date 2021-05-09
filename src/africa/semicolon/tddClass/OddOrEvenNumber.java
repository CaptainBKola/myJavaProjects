import java.util.Scanner;
public class OddOrEvenNumber{
    public static void main(String [] args){
    
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("Checking for even or odd numbers");

        System.out.println("Enter a number: ");
        int userInput = getUserInput.nextInt();
        int divisor = 2;
        
        if(userInput % divisor ==0){
            System.out.println("It's an even number");
        }
        if(userInput % divisor != 0){
            System.out.println("It's an odd number");
        }
}
}

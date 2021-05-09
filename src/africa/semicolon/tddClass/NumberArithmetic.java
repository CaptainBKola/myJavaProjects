    import java.util.Scanner;
public class NumberArithmetic{
    public static void main(String [] args){
        Scanner getUserInput = new Scanner(System.in);

        System.out.println("You are required to enter numbers in the box");
        System.out.println("Enter first number: ");
        int firstUserInput = getUserInput.nextInt();

        System.out.println("Enter second number: ");
        int secondUserInput = getUserInput.nextInt();

        System.out.println("Enter third number: ");
        int thirdUserInput = getUserInput.nextInt();

        int sum = firstUserInput + secondUserInput + thirdUserInput;
        int product = firstUserInput * secondUserInput * thirdUserInput;
        int average = (firstUserInput + secondUserInput + thirdUserInput)/3;
        
        int smallestNumberBetweenFirstAndSecond = 0;
        int largestNumberBetweenFirstAndSecond = 0;
        int smallest = 0;
        int largest = 0;
        
        if(firstUserInput > secondUserInput){
            largestNumberBetweenFirstAndSecond = firstUserInput;
            smallestNumberBetweenFirstAndSecond = secondUserInput;       
        }
        if(firstUserInput < secondUserInput){
            largestNumberBetweenFirstAndSecond = secondUserInput;
            smallestNumberBetweenFirstAndSecond = firstUserInput;       
        }

        if(largestNumberBetweenFirstAndSecond > thirdUserInput){
            largest = largestNumberBetweenFirstAndSecond;
        }
        if(largestNumberBetweenFirstAndSecond < thirdUserInput){
            largest = thirdUserInput;
        }
        if(smallestNumberBetweenFirstAndSecond < thirdUserInput){
            smallest = smallestNumberBetweenFirstAndSecond;
        }
        if(smallestNumberBetweenFirstAndSecond > thirdUserInput){
            smallest = thirdUserInput;
        }

        System.out.printf("%s%d%n", "Sum of the numbers = ", sum);
        System.out.printf("%s%d%n", "Average of the numbers = ", average);
        System.out.printf("%s%d%n", "Product of the numbers = ", product);
        System.out.printf("%s%d%n", "Smallest of the numbers = ", smallest);
        System.out.printf("%s%d%n", "Largest of the numbers = ", largest);

    
}

}

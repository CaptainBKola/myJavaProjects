import java.util.Scanner;
public class LargestAndSmallestIntegers{
    public static void main(String [] args){
        Scanner getUserInput = new Scanner(System.in);

        System.out.println("You are required to enter numbers in the box");
        System.out.println("Enter first number: ");
        int firstUserInput = getUserInput.nextInt();

        System.out.println("Enter second number: ");
        int secondUserInput = getUserInput.nextInt();

        System.out.println("Enter third number: ");
        int thirdUserInput = getUserInput.nextInt();
        
        System.out.println("Enter fourth number: ");
        int fourthUserInput = getUserInput.nextInt();

        System.out.println("Enter fifth number: ");
        int fifthUserInput = getUserInput.nextInt();


        int smallestOfFirstAndSecond = 0;
        int smallestOfFirstSecondAndThird = 0;
        int smallestOfFirstSecondThirdAndFourth = 0;
        int smallestOfAll = 0;

        int largestOfFirstAndSecond = 0;
        int largestOfFirstSecondAndThird = 0; 
        int largestOfFirstSecondThirdAndFourth = 0;
        int largestOfAll = 0;
        
        if(firstUserInput > secondUserInput){
            largestOfFirstAndSecond = firstUserInput;
            smallestOfFirstAndSecond = secondUserInput;       
        }
        if(firstUserInput < secondUserInput){
            largestOfFirstAndSecond = secondUserInput;
            smallestOfFirstAndSecond = firstUserInput;       
        }

        if(largestOfFirstAndSecond > thirdUserInput){
            largestOfFirstSecondAndThird = largestOfFirstAndSecond;
        }
        if(largestOfFirstAndSecond < thirdUserInput){
            largestOfFirstSecondAndThird = thirdUserInput;
        }
        if(largestOfFirstSecondAndThird > fourthUserInput){
            largestOfFirstSecondThirdAndFourth = largestOfFirstSecondAndThird;
        }
        if(largestOfFirstSecondAndThird < fourthUserInput){
            largestOfFirstSecondThirdAndFourth = fourthUserInput;
        }
         if(largestOfFirstSecondThirdAndFourth > fifthUserInput){
            largestOfAll = largestOfFirstSecondThirdAndFourth;
        }
        if(largestOfFirstSecondThirdAndFourth < fifthUserInput){
            largestOfAll = fifthUserInput;
        }
        

        if(smallestOfFirstAndSecond < thirdUserInput){
            smallestOfFirstSecondAndThird = smallestOfFirstAndSecond;
        }
        if(smallestOfFirstAndSecond > thirdUserInput){
            smallestOfFirstSecondAndThird = thirdUserInput;
        }
        if(smallestOfFirstSecondAndThird < fourthUserInput){
            smallestOfFirstSecondThirdAndFourth = smallestOfFirstSecondAndThird;
        }
        if(smallestOfFirstSecondAndThird > fourthUserInput){
            smallestOfFirstSecondThirdAndFourth = fourthUserInput;
        }
         if(smallestOfFirstSecondThirdAndFourth < fifthUserInput){
            smallestOfAll = smallestOfFirstSecondThirdAndFourth;
        }
        if(smallestOfFirstSecondThirdAndFourth > fifthUserInput){
            smallestOfAll = fifthUserInput;
        }
        System.out.printf("%s%d%n", "The largest integer is ", largestOfAll);
        System.out.printf("%s%d%n", "The smallest integer is ", smallestOfAll);
}

}

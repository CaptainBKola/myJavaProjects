import java.util.Scanner;
public class Exercise_2_32{
    public static void main(String [] args){
         Scanner getUserInput = new Scanner(System.in);

        System.out.println("You are required to enter numbers in the box");
        System.out.println("Enter first number: ");
    
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        int firstInput = getUserInput.nextInt();
        if(firstInput > 0){
            positiveCount = 1;
          }
        if(firstInput < 0){
            negativeCount = 1;
          }
        if(firstInput == 0){
            zeroCount = 1;
          }
        System.out.println("Enter second number: ");
        int secondInput = getUserInput.nextInt();
        if(secondInput > 0){
            positiveCount = positiveCount + 1;
          }
        if(secondInput < 0){
            negativeCount = negativeCount + 1;
          }
        if(secondInput == 0){
            zeroCount = zeroCount + 1;
          }

        System.out.println("Enter third number: ");
        int thirdInput = getUserInput.nextInt();
        if(thirdInput > 0){
            positiveCount = positiveCount + 1;
          }
        if(thirdInput < 1){
            negativeCount = negativeCount + 1;
          }
        if(thirdInput == 0){
            zeroCount = zeroCount + 1;
          }
        
        System.out.println("Enter fourth number: ");
        int fourthInput = getUserInput.nextInt();
        if(fourthInput > 0){
            positiveCount = positiveCount + 1;
          }
        if(fourthInput < 0){
            negativeCount = negativeCount +1;;
          }
        if(fourthInput == 0){
            zeroCount = zeroCount + 1;
          }

        System.out.println("Enter fifth number: ");
        int fifthInput = getUserInput.nextInt();
        if(fifthInput > 0){
            positiveCount = positiveCount + 1;
          }
        if(fifthInput < 0){
            negativeCount = negativeCount + 1;
          }
        if(fifthInput == 0){
            zeroCount = zeroCount + 1;
          }
        System.out.printf("%s%d%n", "Number of positive numbers = ", positiveCount);
        System.out.printf("%s%d%n", "Number of negative numbers = ", negativeCount);
        System.out.printf("%s%d%n", "Number of zeros = ", zeroCount);
}
}

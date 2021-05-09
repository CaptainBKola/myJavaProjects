    import java.util.Scanner;
    public class SummingTwoNumbers{
    
        public static void main(String [] args){
        Scanner getUserInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstUserInput = getUserInput.nextInt();

        System.out.println("Enter second number: ");
        int secondUserInput = getUserInput.nextInt();
        
        int sumOfNumbers = firstUserInput + secondUserInput;
        int productOfNumbers = firstUserInput * secondUserInput;
        
        int quotentOfnumbers = firstUserInput / secondUserInput;
        System.out.printf("The sum of the numbers are %d%n", sumOfNumbers);
        System.out.printf("The product of the numbers are %d%n", sumOfNumbers);
         

        if(firstUserInput > secondUserInput){
        int differenceBetweenNumbers = firstUserInput - secondUserInput;
        System.out.printf("The difference of the numbers are %d%n", differenceBetweenNumbers);
        }
        
        if(firstUserInput < secondUserInput){
        int differenceBetweenNumbers = secondUserInput - firstUserInput;
        System.out.printf("The difference of the numbers are %d%n", differenceBetweenNumbers);
        }

        if(firstUserInput > secondUserInput){
        int differenceBetweenNumbers = firstUserInput / secondUserInput;
        System.out.printf("The quotent of the numbers are %d%n", differenceBetweenNumbers);
        }
        
        if(firstUserInput < secondUserInput){
        int differenceBetweenNumbers = secondUserInput / firstUserInput;
        System.out.printf("The quotent of the numbers are %d%n", differenceBetweenNumbers);
        }

}
}

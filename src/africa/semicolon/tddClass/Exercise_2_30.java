import java.util.Scanner;
public class Exercise_2_30{
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Separating digits");
         
        System.out.print("Enter a five digit number ");
        System.out.println();
        int digits = userInput.nextInt();
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;
        int fifthDigit = 0;
        int remainder = 0;
        
       
        
        firstDigit = digits / 10000;
        remainder = digits % 10000;

        System.out.println(remainder);
        secondDigit = (remainder * 10) / 10000;
        remainder = remainder *10 % 10000;
        
        System.out.println(remainder);
        thirdDigit = remainder * 10 / 10000;
        remainder = (remainder *10) % 10000;
    
        System.out.println(remainder);
        fourthDigit = (remainder * 10) / 10000;
        remainder = (remainder *10) % 10000;
        
        System.out.println(remainder);
        fifthDigit = (remainder *10) / 10000;
        System.out.println(thirdDigit);
        
        System.out.printf("%d%s%d%s%d%s%d%s%d%n", firstDigit, "   ", secondDigit, "   ", thirdDigit, "   ", fourthDigit, "   ", fifthDigit);
        
}
}

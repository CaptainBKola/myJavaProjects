    import java.util.Scanner;
public class ComparingTwoIntegers{
    public static void main(String [] args){
        Scanner getUserInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstUserInput = getUserInput.nextInt();

        System.out.println("Enter second number: ");
        int secondUserInput = getUserInput.nextInt();
        
        if(firstUserInput > secondUserInput){
        System.out.printf("%d%s%n", firstUserInput, " is larger");
        }
        if(firstUserInput < secondUserInput){
        System.out.printf("%d%s%n", secondUserInput, " is larger");
        }
        if(firstUserInput == secondUserInput){
        System.out.printf("%s%n", "These numbers are equal");
        }
}

}

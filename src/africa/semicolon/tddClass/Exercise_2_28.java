import java.util.Scanner;    
public class Exercise_2_28{
    public static void main(String [] args){
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("To determine the Diameter, Circumference and Area of a circle");

        System.out.println("Enter the radius of a circle: ");
        int radius = getUserInput.nextInt();
        
        System.out.printf("%s%d%n", "The diameter of the circle is ", 2 * radius);
        System.out.printf("%s%f%n", "The circumference of the circle is ", 2 * Math.PI * radius);
        System.out.printf("%s%f%n", "The area of the circle is ", Math.PI * radius * radius);
}

}

import java.util.Scanner;
public class VolumeOfCylinder{
    public static void main(String [] args){
       Scanner collector = new Scanner(System.in); 
        System.out.print("Enter the raduis and length of a cylinder: ");
        double radius = collector.nextDouble();
        double length = collector.nextDouble();
        
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %f%n", area );
        System.out.printf("The volume is %.1f%n", volume);
}
}

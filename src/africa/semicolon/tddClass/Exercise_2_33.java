import java.util.Scanner;
public class Exercise_2_33{
    public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("This application helps you determine your Body Mass Index");
        System.out.println("Enter your  weight in Kilograms");
        int weight = userInput.nextInt();
        System.out.println("Enter your heigth in meters");
        int height = userInput.nextInt();
        int BMI = 0;

       
       BMI = (weight)/(height * height);
        System.out.printf("Your Body Mass Index is %d%n", BMI);
        int underWeigth = 0;
        int normalWeigth = 0;
        int overWeigth = 0;
        int obese = 0;
       
        if(BMI < 18.5){
            underWeigth = 1;
        }
        if(BMI >= 18.5){
            underWeigth = 0;
            normalWeigth = 1;
        }     
        if(BMI >=25){
            normalWeigth = 0;
            overWeigth = 1;
        }
         if(BMI >= 30){
             overWeigth = 0;
            obese = 1;
        }  
    if(underWeigth ==1) 
        System.out.println("You are underweigth");
    if(normalWeigth == 1)
        System.out.println("Your weigth is normal");
    if(overWeigth == 1)
        System.out.println("You are overweigth");
    if(obese == 1)
        System.out.println("You are obese");
        System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater");
}

}

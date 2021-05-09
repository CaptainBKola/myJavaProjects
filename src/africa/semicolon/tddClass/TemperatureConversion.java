import java.util.Scanner;
public class TemperatureConversion{
    public static void main(String [] args){
        System.out.print("Enter a degree celsius: ");
        Scanner collector = new Scanner(System.in);
        double celsiusTemperature = collector.nextDouble();
        double fahrenheitTemperature = (9.0/5) * celsiusTemperature + 32;
        System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", celsiusTemperature, fahrenheitTemperature);
    
}
}

package ChapterFour;

import java.util.Scanner;
public class Karta {


    public int convertToBaseTwo(int numberInBaseTen) {
       String result = "";
    while (numberInBaseTen != 0){

        result = (numberInBaseTen % 2) + result;
    numberInBaseTen  = numberInBaseTen / 2;

    }
return Integer.parseInt(result);
        }

public static void converter() {
    Scanner keyboard =new Scanner(System.in);
    Scanner keyboard2 = new Scanner(System.in);
  int remain;
    System.out.println("Please enter a decimal number:");
    int quotient = keyboard.nextInt();
    System.out.println("Please enter the base value:");
    int remainder = keyboard2.nextInt();

    do {
       remain = quotient % remainder;
        quotient = quotient / remainder;
        System.out.println(remain);
        System.out.print(quotient);

    } while (quotient != 0);
}

 static void binConverter(){
        String tableFmt = " %11s %11s %11s\n";
        System.out.printf(tableFmt, "Binary", "Octal", "Hexadecimal");
        for (int i = 1; i <= 256; i++) {
            System.out.printf(tableFmt, Integer.toBinaryString(i),
                    Integer.toOctalString(i),
                    Integer.toHexString(i).toUpperCase());

        }
    }

    //finding that a number exist in a list
    static boolean findAnumber(int[] number, int num){


       for (int digit: number){

            if (digit == num){

                return true;
            }

        }

       return false;


   }


    public static void main(String[] args) {

        System.out.println( findAnumber(new int[]{2, 34, 5, 6, 5, 3}, 5));

       // Karta karta = new Karta();
    //    System.out.println(  karta.convertToBaseTwo(6));
        //Karta.binConverter();
      //  Karta.converter();
    }


}





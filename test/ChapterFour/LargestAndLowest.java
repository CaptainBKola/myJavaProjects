package ChapterFour;

import java.util.Scanner;

public class LargestAndLowest{

    public  static void main (String  args[]){

        int largest = 0;
        int counter = 1;
        int smallest = 0;

       /* for (int i = 10; i >= 0; i = i - 2) {
            System.out.println(i);
        }
*/

        while (counter <= 3) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number");

            // This method reads the number provided using keyboard

               int inputtedNumber = input.nextInt();



                if (inputtedNumber > largest){
                    largest = inputtedNumber;
                }

                if (smallest == 0) {
                    smallest = inputtedNumber;
                }


                else if (inputtedNumber <= smallest) {
                    smallest = inputtedNumber;
                }


                    counter++;

                }



        System.out.println(counter);

        System.out.println(largest+"   is the largest number");
        System.out.println(smallest+"  is the smallest number");



        }


    }








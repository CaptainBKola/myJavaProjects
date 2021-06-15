public class Karta {

        public int reverseInt(int num) {



            int reversed = 0;

            while(num != 0) {

                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            return reversed;

        }



    public int findFactorialOf(int number) {

                int fact = 1;

                for(int i=1; i<=number; i++){
                    fact = fact * i;

                }

        return fact;

    }

    public int findFactorialOfWithWhileLoop(int number){
            int addition = 0;
            int subtraction = 0;
            int count = 1;
            int factorial = 1;
            while (number >= count ){

                factorial = number * factorial;
                addition = addition + number;
                subtraction = number - subtraction;
                number = number - 1;

            }
        System.out.println(number+"  number");
        System.out.println(count+" i");



        System.out.println(subtraction+" substraction");

        return factorial;

    }




    }





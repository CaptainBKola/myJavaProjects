public class Tuition {


    public static void main(String[] args) {

        double amountAfterTenYears = 0;
        int year = 1;

        double tuition = 10000;


        while (year <= 14) {
            tuition = ((5*tuition)/100) + tuition ;


            if (year>10){
                amountAfterTenYears = tuition + amountAfterTenYears;
            }

            year++;
        }
        System.out.println(amountAfterTenYears);




    }


}

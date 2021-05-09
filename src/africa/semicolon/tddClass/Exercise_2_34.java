public class Exercise_2_34{
    public static void main(String [] args){

        long currentWorldPopulation = 7900000000l;
        long annualGrowthRate = 83000000l;
        long afterOneYear = 7900000000l + 83000000l;
        long afterTwoYears = afterOneYear + 83000000l;
        long afterThreeYears = afterTwoYears + 83000000l;
        long afterFourYears = afterThreeYears + 83000000l;
        long afterFiveYears = afterFourYears + 83000000l;

        System.out.printf("Current World Population =\t%d%nAnnual growth rate\t=\t%d%n", currentWorldPopulation, annualGrowthRate);
        System.out.println("\tEstimated World population for the next five years");
        System.out.printf("After 1 year =\t%d%nAfter 2 years =\t%d%nAfter 3 years =\t%d%nAfter 4 years =\t%d%nAfter 5 years =\t%d%n", afterOneYear, afterTwoYears, afterThreeYears, afterFourYears, afterFiveYears);

        

}
}

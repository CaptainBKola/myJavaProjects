package chapterThreeExercises;

public class Karta {

private int pricePerCopy;
private int profit;

    private int numberOfCopy;

    void quantityDemand(int numberOfCopy){

        this.numberOfCopy = numberOfCopy;

    }

    public int calculatePrice(){

        if (numberOfCopy <= 4){
           pricePerCopy = numberOfCopy * 1500;

        }

        else
            if (numberOfCopy == 5 || numberOfCopy <=9 ){
           pricePerCopy = numberOfCopy * 1400;
        }
        else
         if (numberOfCopy == 10 || numberOfCopy <= 29){
            pricePerCopy = numberOfCopy * 1200;

        }
        else
            if (numberOfCopy == 30 ){
            pricePerCopy = numberOfCopy * 1100;
        }
        else
            if (numberOfCopy == 50 || numberOfCopy <= 59){
            pricePerCopy = numberOfCopy * 1000;
        }

        else
            if (numberOfCopy == 100 || numberOfCopy <= 199){
            pricePerCopy = numberOfCopy * 900;
        }

        else
            if (numberOfCopy > 200){
       pricePerCopy = numberOfCopy * 800;
     }



        return pricePerCopy;}


    public int calculateProfit() {

        final int PRICE_AT_RETAIL = 2000;

        if (numberOfCopy <= 4){
            profit = (PRICE_AT_RETAIL* numberOfCopy) -(numberOfCopy *1500);

        }

        else
        if (numberOfCopy == 5 || numberOfCopy <=9 ){
            profit = (PRICE_AT_RETAIL* numberOfCopy) -(numberOfCopy *1400);
        }
        else
        if (numberOfCopy == 10 || numberOfCopy <= 29){
            profit = (PRICE_AT_RETAIL * numberOfCopy) - (numberOfCopy *1500);

        }
        else
        if (numberOfCopy == 30 ){
            profit = (PRICE_AT_RETAIL* numberOfCopy) -(numberOfCopy *1100);
        }
        else
        if (numberOfCopy == 50 || numberOfCopy <= 59){
            profit = (PRICE_AT_RETAIL* numberOfCopy) -(numberOfCopy *1000);

        }

        else
        if (numberOfCopy == 100 || numberOfCopy <= 199){
            profit = (PRICE_AT_RETAIL* numberOfCopy) -(numberOfCopy *900);

        }

        else
        if (numberOfCopy >= 200){
            profit = (PRICE_AT_RETAIL* numberOfCopy) -(numberOfCopy * 800);

        }



       return profit;




    }
}

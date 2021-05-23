package chapterThreeExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KartaTest {

    @Test

    void calculatesPricePerQuantity(){

    Karta price = new Karta();
    price.quantityDemand(4);

    assertEquals(6000,price.calculatePrice());

    assertEquals(2000, price.calculateProfit());

    }




}

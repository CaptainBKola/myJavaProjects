package chapterThreeExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KartaTest {

    @Test

    void calculatesPricePerQuantity(){

    Karta price = new Karta();
    price.setQuantity(4);

    assertEquals(6000,price.getPrice());

    assertEquals(2000, price.getProfit());

    }




}

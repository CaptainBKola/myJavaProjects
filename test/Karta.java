import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KartaTest {

    @Test
    void testReversedNumberInt() {
        Karta karta = new Karta();

    assertEquals(654321, karta.reverseInt(123456));

    }

    @Test
    void testFindFactorialOf(){

        Karta karta = new Karta();
        assertEquals(1, karta.findFactorialOf(1));


    }

    @Test
    void testFindFactorialOfWithWhileLoop(){

        Karta karta = new Karta();
        assertEquals(120, karta.findFactorialOfWithWhileLoop(5));


    }



}

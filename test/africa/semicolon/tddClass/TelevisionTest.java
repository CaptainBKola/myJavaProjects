/*import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    Television televazision1= new Television(1992,"ShibaTvSet");

    @BeforeEach
    void setup(){

        Television television1 = new Television(1992,"ShibaTvSet");

    }



    @Test

    void setOnAndOff(){
    television1.setOn(false);
    assertFalse(television1.getTvOnOff());


    }

@Test
    void increaseVol(){
        television1.setOn(true);
        assertTrue(television1.getTvOnOff());
        television1.setVolume(30);
        assertEquals(31,television1.increaseV());

    }

    @Test

    void decreaseVol(){
        television1.setOn(true);
        assertTrue(television1.getTvOnOff());
        television1.setVolume(30);
        assertEquals(29,television1.decreaseV());

    }

    @Test
    void changeChanels (){

        television1.setOn(true);
        assertTrue(television1.getTvOnOff());
        television1.setVolume(30);
        assertEquals(29,television1.decreaseV());
        television1.setVolume(30);
        television1.setVolume(35);
        assertEquals(36,television1.increaseV());
        television1.setChanels(55);
        assertEquals(1,television1.increaseChannels());
       assertEquals(0,television1.decreaseChannels());




    }












}

 */
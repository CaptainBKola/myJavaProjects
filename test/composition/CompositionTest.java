package composition;

import compostion.Kola;
import compostion.Macbook;
import org.junit.jupiter.api.Test;

import java.awt.image.MultiPixelPackedSampleModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositionTest {

    @Test
    void macbookIsOn(){

        Macbook macbook = new Macbook(false);
        macbook.isOn(true);
        assertEquals(true, macbook.getIsOn());


    }

    @Test
    void kolaHasMacook(){

        Macbook macbook = new Macbook(false);






    }





}

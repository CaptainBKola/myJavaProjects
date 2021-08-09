package algorithmTest;

import algorithm.ArraySorter;
import algorithm.BubbleSorter;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

public class BubbleSorterTest {
    private ArraySorter

   // @BeforeEach
  //  void setUp(){
        sorter = new BubbleSorter();

    //}


    @AfterEach
    void tearDown(){

    }


    @Test
    void sortWithoutArray(){
      //  assertThrows(ArraySorterExceptions.class,() -> sorter.sort(arrayTo));

    }
    @Test
    void sortArray(){

        int[] scores = {10, 8, 5, 3, 7, 9, 2, 1, 6, 4};
        int[] expectedScores = {1,2,3,4,5,6,7,8,9};


    }
}

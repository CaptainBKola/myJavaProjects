package algorithmTest;

import algorithm.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test

    void TestThatTwoSumIndex(){
        // given

        int[] array;
        int target;

        //when
        int[] actual = TwoSum.arrayIndices(new int[]{1, 2,2, 3, 4},4);
        int [] expected = {0,3};

        //assert




        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(TwoSum.arrayIndices(new int[] {1,2,3,4,54,3},5)));






    }



}

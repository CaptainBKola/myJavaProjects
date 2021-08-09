package ChapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeriesTest {
    Series series  = new Series();


    @Test
       void  seriesOfThreeNumbersPredictTheNextFourthNumber(){

        Series series = new Series();

        assertEquals(9,series.returnTheFourthNumberInTheSeries(3,5,7));
    }


}

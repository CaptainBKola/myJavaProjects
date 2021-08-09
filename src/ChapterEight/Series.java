package ChapterEight;

public class Series {

    public int returnTheFourthNumberInTheSeries(int first,int second,int third) {

       int forthterm = 0;
        for (int i = 1; i<= third;i++){

            if (forthterm == 0){
                forthterm = third + second - first;

                return forthterm;
            }
        }



        return  forthterm;
    }
}




package ChapterEight;

import java.util.InputMismatchException;

public class Time {

    private int hour;
    private int minute;
    private int second;

    //throws Exception
    public void setTimeWith (int hour, int minute, int second) {

        //IllegalArgumentException exception = new IllegalArgumentException();
        boolean hourIsInvalid = hour < 0 || hour >= 24; //explanatory variable
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid Hour,\n Enter hour between 0 and 24");
    //exception has overloaded multiple method-- 4 different constructor

        boolean minuteIsInvalid = minute < 0 || minute >= 60;

        if (minuteIsInvalid) throw new IllegalArgumentException("Invalid Minute,\n Enter minute between 0 and 24");
        boolean secondIsInvalid = second < 0 || second >= 60;
        if (secondIsInvalid) throw new IllegalArgumentException("Invalid second,\n Enter minute between 0 and 24");
        //this code will still set the time cos its ifs ifs and no else


        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.setTimeWith(2, -2, 4939);
        } catch (IllegalArgumentException | InputMismatchException | NullPointerException error) {
            System.out.println(error.getMessage());

            //error.printStackTrace();
        }
    }
}

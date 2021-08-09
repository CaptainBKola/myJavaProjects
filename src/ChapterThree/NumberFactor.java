package ChapterThree;

public class NumberFactor {
    public static void main(String[] args) {

        findFact(4);

    }

    public static int findFact ( int number){

        int count = 1;

        while ( count<=number) {

            if (number % count == 0) {
                System.out.print(count+" ");


            }
            count++;

        }

        return count;
    }

}

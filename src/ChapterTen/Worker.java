package ChapterTen;


public class Worker {
    public void methodOne(int number ){
        if (number==1)
        throw new NullPointerException("Kelvin is Awake");
        if (number == 2)
            throw new ArrayStoreException();
        if (number == 3 )
            throw new IllegalArgumentException();

    }
    private Object methodTwo(Exception ise) throws Exception{

        Exception janet = new Exception();
        //throw ise;
        return "i";

    }

   static int[] age = {12, 4, 5, 2, 5};

    public static int sum( int[] intArrays){
        int sum = 0;
        for(int number : intArrays) sum += number;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(age));
    }

}

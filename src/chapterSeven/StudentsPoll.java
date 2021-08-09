package chapterSeven;

public class StudentsPoll {
    public static void main(String[] args) {
        String[] text = {"So", "many", "books", "so", "little", "time"};

        System.out.println(finder(text,"so"));


        int[] response = {1,2,2,0,0,2,3,3,4,5,5,5,5,6,9,7,8,8,10};
        int [] frequency = new int[12];
        for (int i = 0; i < response.length; i++){
            try {
                ++frequency[response[i]];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf(" responses[%d] = %d%n%n", i, response[i]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");
        for (int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }




public static StringBuilder finder (String[] sentence, String target) {

    StringBuilder storage = new StringBuilder();

    for (int word = 0; word < sentence.length; word++) {
        if (sentence[word].equals(target)) {
            storage.append(sentence[word]);


        }

    }

    return storage;

}

}




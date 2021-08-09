import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int largestScore = 0;
        String highestName = "";
        String lowestName = "";
        int lowestScore = 0;

        System.out.println("Enter Number of Student:");
        int studentScore = scanner.nextInt();
        while (counter < studentScore){
            counter++;


            System.out.println("Enter score "+ counter +" score");
            int score = scanner.nextInt();


            scanner.nextLine();
            System.out.println("Enter name "+ counter+" score");
            String name = scanner.nextLine();


            if (largestScore==0 && lowestScore==0){

                largestScore = score;
                highestName = name;
                lowestScore = score;
                lowestName = name;

            }


            else if(score > largestScore){
                largestScore = score;
                highestName = name;
            }

            else if(score < lowestScore){
                lowestScore = score;
                lowestName = name;
            }


        }

        System.out.println("The Student name "+ highestName + " "+ largestScore);

        System.out.println("The Student name "+ lowestName + " "+ lowestScore);

    }

}

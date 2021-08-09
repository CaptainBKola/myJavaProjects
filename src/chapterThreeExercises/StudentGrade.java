package chapterThreeExercises;

import java.util.Scanner;

public class StudentGrade{


    static Scanner inputCollector = new Scanner(System.in);

    private static  int numberOfSubjects;
    private static int[][] scores;
    private static int numberOfStudents;

    public static void main(String[] args){

        setUp();
        storeInput();
        outPut();

    }

    private static void outPut() {

        System.out.println("Number of Students "+ numberOfStudents+" "+"Number of Subjects "+numberOfSubjects);

        for(int students = 0; students < numberOfStudents; ) {
            for (int subjects = 0; subjects < numberOfSubjects; subjects++) {
                System.out.println(scores[students][subjects]);
            }
            System.out.println("--------------------");

        }

    }

    private static void setUp() {
        System.out.println("ENTER NUMBER OF STUDENTS");
        numberOfStudents = inputCollector.nextInt();
        System.out.println("ENTER NUMBER OF SUBJECTS");
        numberOfSubjects = inputCollector.nextInt();

    }


    private static void storeInput() {
        scores = new int[numberOfStudents][numberOfSubjects];

        for(int students = 0; students < numberOfStudents; students++) {
            System.out.println("Entering score for Student " + (students + 1));

            for (int subjects = 0; subjects < numberOfSubjects; subjects++) {
                System.out.println("ENTERING score for Subject "+ (subjects + 1) + " Student " +(students +1));
                scores[students][subjects] = inputCollector.nextInt();

                System.out.println("Scores for student " + (students + 1 )+ " subject  "+(subjects + 1) + " saved successfully");
            }
            System.out.println("Scores for student " + (students + 1 )+ " Saved succesfully");
            System.out.println(numberOfStudents);
            System.out.println(students);
        }


    }




        //prompt
                //NUMBER OF STUDENTS
                //NUMBER OF SUBJECTS

        //collect
            //collecting scores to student

        //outPut


}

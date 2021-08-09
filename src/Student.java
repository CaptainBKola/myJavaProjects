


import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number of students ");
        int numberOfStudents = input.nextInt();

        String studentWithHigestScore = "";

        int studentNumber = 1;

        System.out.println("Enter "+studentNumber +" student score");
        int highestScore = input.nextInt();

        input.nextLine();
        System.out.println("Enter "+studentNumber +" student name");
        input.nextLine();

        while (studentNumber < numberOfStudents){
            studentNumber++;

            System.out.println("Enter "+studentNumber +" student score");
            int studentScore = input.nextInt();

            input.nextLine();

            System.out.println("Enter "+studentNumber +" student name");
            String studentName = input.nextLine();

            if(highestScore <= studentScore){
                highestScore = studentScore;
                studentWithHigestScore = studentName;
            }

        }

        System.out.println("Student with who scored highest is "+studentWithHigestScore +" with a score of "+highestScore);

        }

    }


/* Grading students according to scores.
The student that scores 90 and above is graded A
80-89 is graded B
70-79 is graded C
60- 69 is graded  E
scores below 60 is grade F
*/




import java.util.Scanner;  // Import the Scanner class

public class PrintScore{   //declaring our class

public static void main(String[] args) {    //declaring our main method

Scanner myObj = new Scanner(System.in);  
System.out.println("Enter  ur score");    //as user users for score
int score = myObj.nextInt();            // storing  input to score 




//grading System


if (score >= 90){
System.out.println("Grade is A");
//if score is greater than 90, students grade is A
}

else if (score >= 80 && score <= 89){
System.out.println("Grade is B");
//80-89 is graded B



}



else if (score >= 70 && score <= 79){
System.out.println("Grade is C");
//70-79 is graded C



}


else if (score >= 60 && score <= 69){
System.out.println("Grade is D");
//60- 69 is graded  E


}


else if (score <=59){
System.out.println("Grade is F");

//scores below 60 is grade F


}

}
}
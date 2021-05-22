package chapterThreeExercises;

public class Student {

   private int studentScore;

    void  setAverageScore(int studentScore){
        this.studentScore = studentScore;

    }

    public String getScoringGrade() {

        String scoringGrade = ""; // initialized to empty String
        if (studentScore >= 90.0)
            scoringGrade = "A";
        else if (studentScore >= 80.0)
            scoringGrade = "B";
        else if (studentScore >= 70.0)
            scoringGrade = "C";
        else if (studentScore >= 60.0)
            scoringGrade = "D";
        else
            scoringGrade = "F";
        return scoringGrade;
    }

}
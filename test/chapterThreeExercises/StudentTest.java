package chapterThreeExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    public void getGradesOfStudents(){

        Student  studentGrade = new Student();
        studentGrade.setAverageScore(54);
        assertEquals("F",studentGrade.getScoringGrade());
    }





}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void  setAverageGrade(){
        Student studentGrade = new Student("Kola",20);
        studentGrade.setAverage(30);
        assertEquals(30,studentGrade.getAverage());
        System.out.print(studentGrade.getAverage());

    }
    @Test
    public void setStudentName(){
        Student studentGrade = new Student("Kunle",10);
        studentGrade.setName("Bayo");
        assertEquals("Bayo",studentGrade.getName());

    }

    @Test
    public void getGradesOfStudents(){
        Student  studentGrade = new Student("Kunle",50);
        assertEquals("F",studentGrade.getScoringGrade());

    }





}
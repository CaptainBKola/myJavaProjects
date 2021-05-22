

    public class Student
{
        private String name;
        private double average;
        // constructor initializes instance variables
        public Student(String constructorName, double constructorAverage)
        {
            name = constructorName;
            // validate that average is > 0.0 and <= 100.0; otherwise,
             // keep instance variable average's default value (0.0)

            if (constructorAverage <= 100.0)
                if (constructorAverage > 0.0)
                     average = constructorAverage; // assign to instance variable
             }

        // sets the Student's name
         public void setName(String studentName)
         {
             name = studentName;}

         // retrieves the Student's name
         public String getName() {
             return name;
             }

         // sets the Student's average
         public void setAverage(double studentAverage) {
             // validate that average is > 0.0 and <= 100.0; otherwise,
             // keep instance variable average's current value
             if (studentAverage > 0.0)
                 if (studentAverage <= 100.0)
                     average = studentAverage; // assign to instance variable 40 }
         }
             // retrieves the Student's average

        public double getAverage(){
                 return average;
             }

             // determines and returns the Student's letter grade
        public String getScoringGrade(){

            String scoringGrade = ""; // initialized to empty String
                 if (average >= 90.0)
                     scoringGrade= "A";
                 else if (average >= 80.0)
                     scoringGrade= "B";
                 else if (average >= 70.0)
                     scoringGrade = "C";
                 else if (average >= 60.0)
                     scoringGrade = "D";
                 else
                     scoringGrade = "F";
                return scoringGrade;
             }



} // end class Student

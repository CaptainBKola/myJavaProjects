package africa.semicolon.tddClass;


public class Calculator {

    public int multiply(int firstNumber, int secondNumber) {
        return  firstNumber * secondNumber;
    }


    public int add(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber){
            int a = firstNumber-secondNumber;
            if (firstNumber < secondNumber){
            return a * -1;
        }
            else {
                return a;
            }
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }


}


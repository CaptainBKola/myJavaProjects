/**
package ChapterThree;

public class Variable {

    public static int staticVariable;
    private int instanceVariable;
    public boolean defaultInstanceVariable;


    // Static Initializer Block
  static {
        System.out.println("Static Initializer Block");

        System.out.printf("staticVariable After Initialization = %s\n", staticVariable);
    }

    // Instance Initializer Block


    {

        System.out.println("Instance Initializer Block");
        System.out.printf("instanceVariable After Initialization = %d\n", instanceVariable);
    }




    // Static Method

    public static void staticMethod() {

        System.out.println("Static Method");
        System.out.printf("staticVariable After Initialization = %c\n", staticVariable);
    }

    public static StaticAndNonStatic name(){

    }


    // Instance Method
    public void instanceMethod() {
    staticVariable = 5;
    staticMethod();
    instanceVariable = 4;
        char localVariable = '!';

        System.out.println("Instance Method prints instance variable: "+ instanceVariable);
        System.out.printf("localVariable After Initialization = %c\n", localVariable);
        System.out.println(staticVariable +" this is static");
    }
    public static void main(String[] args) {

       new Variable().instanceMethod();
        System.out.println("");

        System.out.println(Variable.staticVariable+"is static va?");




    }
//Call 1:

    //instanceMethod();

 Static Initializer Block
 staticVariable After Initialization = Static Variable Example
 Instance Initializer Block
 instanceVariable After Initialization = 1
 Constructor Block
 Instance Method
 localVariable After Initialization = !


//Call 2:


//Output 2:

 Static Initializer Block
 staticVariable After Initialization = Static Variable Example
 Static Method

}
**/
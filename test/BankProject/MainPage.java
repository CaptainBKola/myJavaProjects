package BankProject;

import java.util.Scanner;

public class MainPage {



    public static void firstPage(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nWelcome to Malcon bank\n ");
        String prompt = """
                    Enter 1 Staff Log in:
                    Enter 2 Customer log in 
                    Enter 3 Exit
                    """;
        System.out.println(prompt);
        int userOptions = userInput.nextInt();

        if (userOptions == 1) {
            Staffs.staffLogin();


        } else if (userOptions == 2) {

        Customer.defaultCustomerLogin();

        } else {
            System.exit(0);
        }
    }
}

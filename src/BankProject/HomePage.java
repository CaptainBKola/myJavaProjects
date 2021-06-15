package BankProject;

import java.util.Scanner;

public class HomePage {
    Staffs staffs = new Staffs();


    public static void main(String[] args) {

        HomePage homePage = new HomePage();

        homePage.homeDashboard();


    }

        Scanner userInput = new Scanner(System.in);

        public void homeDashboard () {
            System.out.println("Welcome to Malcon bank");


            String prompt = """
                    Enter 1 Staff Log in:
                    Enter 2 Customer log in 
                    Enter 3 Exit
                    """;
            System.out.println(prompt);

            int userOptions = userInput.nextInt();

            if (userOptions == 1) {

                staffs.getLogInPage();


                //staff log in page


            } else if (userOptions == 2) {
                // Customer log in page


            } else {

                //exit app
                System.exit(0);

            }

        }
    }


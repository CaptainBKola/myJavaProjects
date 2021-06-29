package BankProject;

import java.util.Scanner;

public class HomePage {

    Staffs staffs = new Staffs();



      static public void homeDashboard (){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Welcome to Malcon bank");


            String prompt = """
                    Enter 1 Staff Log in:
                    Enter 2 Customer log in 
                    Enter 3 Exit
                    """;
            System.out.println(prompt);

            int userOptions = userInput.nextInt();

            if (userOptions == 1) {

                Staffs.setLogInPage("username","password1989");
                HomePage.homeDashboard();

                //staff log in page


            } else if (userOptions == 2) {
                Customer.setLogInPageCustomer("username","password1989");

                // Customer log in page
                Customer customer = new Customer("jn", "yy", "090999");



            } else {

                //exit app
                System.exit(0);

            }

        }

    public static void main(String[] args){



Account account = new Account();

        HomePage.homeDashboard();
        System.out.println(account);

    }

    }


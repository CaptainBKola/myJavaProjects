package BankProject;

import java.util.Scanner;

public class Staffs {

    static Scanner userInput = new Scanner(System.in);
  private static boolean isLoggedIn = false;
  private static String defaultPassword = "admin";


    public static void staffLogin() {

        System.out.println("Welcome Back");

    System.out.println(" Please Enter your admin Password");
    String userInputedPassword = userInput.nextLine();
    userInputedPassword = userInputedPassword.toLowerCase();


    boolean passwordIsTrue = userInputedPassword.equals(defaultPassword);

    if (passwordIsTrue) {
        isLoggedIn = true;
        System.out.println("Success!!!");
        if (isLoggedIn) {
            System.out.println("Enter 1 to view Customers Account\nEnter 2 delete Account\nEnter 3 to logOut");
            int input = userInput.nextInt();
            if (input == 1) {
               // Customer.createAccount();


            } else if (input == 2) {
               // Customer.deleteAccount();
                System.out.println("Account deleted successfully");
            } else if (input == 3) {

                System.out.println("Account Logged out");


                MainPage.firstPage();



            }

        }


    }
    else {
        System.out.println("Wrong Password");


    }

}




}







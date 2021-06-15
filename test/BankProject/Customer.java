package BankProject;
import java.util.Scanner;

public class Customer {
    static Scanner input = new Scanner(System.in);

   static  String customerUsername ="";
    static String customerPassword = "";

    private static boolean isLoggedIn = false;

    static void defaultCustomerLogin(){
        System.out.println("Welcome");
        String defaultPassword= "custom";
        String defaultUsername = "custom";
        System.out.println("please enter custom as your default username\nYou can change it later");
        String customerUsername = input.nextLine();

        System.out.println("please enter Custom as default password\nYou can change it later");
        String customerPassword = input.nextLine();

        boolean veryfyPasswordAndUsername = customerPassword.equals(defaultPassword)&customerUsername.equals(defaultUsername);

        if (veryfyPasswordAndUsername ){
            isLoggedIn = true;
            System.out.println("Please enter 1 to create account\n please Enter 2 to log in");
            int userOption = input.nextInt();
            if (userOption== 1){
               createAccount();

//CREATE ACCOUNT
            }
            else if (userOption == 2){
//LOG IN

            }

        }

    }






    public static void createAccount() {
                 String names;
                 String state;
                 String address;
                 String accountNumber;
        System.out.println("Enter your names");
        names =input.nextLine();
        input.nextLine();

        System.out.println("Enter your state of origin");
        state =input.nextLine();

        System.out.println("Enter your address");
        address  = input.nextLine();

        System.out.println("Enter a new username");
        String  username = input.nextLine();
        customerUsername = username;

        System.out.println("Enter your new unique password");
        String userPassword = input.nextLine();
        customerPassword = userPassword;
        System.out.println("Account created successfully logged in");

        logIn();

    }

    private static void logIn(){
        System.out.println("Weclome");
        System.out.println("Enter 1 to deposit\n Enter 2 to withdraw\n Enter 3 to transfer \n Enter 4 to");


    }




}


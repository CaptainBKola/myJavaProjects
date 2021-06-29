package BankProject;

import java.util.Scanner;

public class Customer {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public  static String customerUserName;
    public  static String customerPassword;
    private final Account account;

    // ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        account = new Account();
    }



    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("Please enter your Last name");

        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;

    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        System.out.println("Please enter your first name");

        this.firstName = firstName;
    }


    public static void setLogInPageCustomer(String username, String password) {

        if ((username == "username") && (password == "password1989")) {


            customerUserName = username;
            customerPassword = password;
            System.out.println("You are now logon!");



            Scanner input = new Scanner(System.in);

            System.out.println("Enter 1 to deposit\n Enter 2 to withdraw\n Enter 3 to transfer\n Enter 4 for phone topup");
            int userOption = input.nextInt();

            if  (userOption ==1){

                Account.deposit(600);

                System.out.printf("your deposit was successful");
            }
            else if  (userOption ==2){

                Account.setWithdraw(600);
                System.out.println(" your withdrawal was successful");

            }
            else if  (userOption ==3){

                Account.setTransfer(600);

                System.out.println(" your transfer was successful");
            }
            else if  (userOption ==4){

                Account.loadAirtime(600,"07036497792");

                System.out.println(" your recharge was successful");
            }
            else{
                System.out.println("Ooooops incorrect infos!!!");
                HomePage.homeDashboard();
            }






        }
        else{


            System.out.println("Ooooops incorrect infos!!!");
            System.out.println("".repeat(7));
            HomePage.homeDashboard();


        }
    }
}
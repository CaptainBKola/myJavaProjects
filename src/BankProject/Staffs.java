package BankProject;

import java.util.Scanner;

public class Staffs {


    static String staffUserName;
    static String staffPassword;

    public static void setLogInPage(String username, String password) {


        if ((username == "username") && (password == "password1989")) {
            staffUserName = username;
            staffPassword = password;
            displayPrompt("You are now logon!");

            displayPrompt("Enter 4 to view all account\nEnter 5 to view Customers Account\nEnter " +
                    "exit");
            Scanner input = new Scanner(System.in);
            int staffOption = input.nextInt();
            if (staffOption == 4) {


            } else if (staffOption == 5) {

            }
            else
            {
                HomePage.homeDashboard();
            }




            }

        else

        {
            displayPrompt("Incorrect password or Username");
            // Thread.sleep(5000);
            // Thread.sleep(5000);
            HomePage.homeDashboard();
        }






    }
    public static String getLogInPage () {

        return Staffs.staffPassword;

    }
    private static void displayPrompt (String message){
        System.out.println(message);
    }

}


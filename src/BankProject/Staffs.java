package BankProject;

import java.util.Scanner;

public class Staffs {

     String  staffUserName;
     String  staffPassword;

    public void setLogInPage(String username, String password) {


            if ((username == "username") && (password == "password1989")) {
                staffUserName = username;
                staffPassword = password;
                displayPrompt("You are now logon!");

                displayPrompt("Enter 4 to view all account\nEnter 5 to view Customers Account\nEnter " +
                        "exit");
                Scanner input = new Scanner(System.in);
                int staffOpiton = input.nextInt();
                if (staffOpiton == 4){


                }
                else if(staffOpiton ==5){

                }
                else{

                }

            }



        }

    public String getLogInPage(){

        return staffPassword;

    }


    public static void displayPrompt(String message){
        System.out.println(message);
    }



}

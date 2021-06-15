package BankProject;


import java.util.Locale;
import java.util.Scanner;

public class Staffs {

     String user;
     String pass;
    public void setlogInPage(String username, String password) {


        if ((username == "username") && (password == "password1989")) {
              user = username;
              pass = password;
            System.out.println("You are now logon!");

        }

    }
    public String getLogInPage(){



        return pass;

    }

}

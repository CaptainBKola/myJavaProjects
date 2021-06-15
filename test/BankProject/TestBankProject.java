package BankProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBankProject{
    private Account account; //declaring each classes here to ignore iterative instantiation of object
    private Customer customer;
    private Staffs staffs;

    @BeforeEach
    void setUp(){
        account = new Account(0,"12");
        customer = new Customer();
        staffs = new Staffs();

    }


    @Test
    void accountCanDepositAndWithdrawAndTransfer(){

account.deposit(300);
account.deposit(300);
        //assertEquals(600, account.getDeposit());
account.setTransfer(200);
//assertEquals(400, account.getTransfer());
account.setWithdraw(300);
        //assertEquals(100, account.getTransfer());
account.setTransfer(50);
        assertEquals(50, account.getTransfer());

    }

    @Test
    void testAccountCanTransfer(){
        account.deposit(4000);
        account.loadAirtime(200,"07036497792");
        assertEquals(3800,account.getLoadAirtime());

    }

    @Test

    void StaffsCanLogInWithPasswordAndAssignedUsername(){
staffs.setlogInPage("usernam", "password1989");

        assertEquals("password1989", staffs.getLogInPage());

    }



    public static void main(String[] args) {
        Staffs staffs = new Staffs();
        Scanner userInput = new Scanner(System.in);
        userInput = new Scanner(System.in);

        System.out.println("\nWelcome to Malcon bank\n ");

        String prompt = """
                Enter 1 Staff Log in:
                Enter 2 Customer log in 
                Enter 3 Exit
                """;
        System.out.println(prompt);

        int userOptions = userInput.nextInt();

        if (userOptions == 1) {
            staffs.setlogInPage("username","password1989");


            //staff log in page


        } else if (userOptions == 2) {
            // Customer log in page



        } else {

            //exit app
            System.exit(0);

        }
    }

    }
















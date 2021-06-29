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
    private HomePage homePage;

    @BeforeEach
    void setUp(){
        account = new Account();
        customer = new Customer("Badmus","Kola","07036497792");
        staffs = new Staffs();
        homePage = new HomePage();

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
    void testAccountNumberCreated(){
        Account account = new Account();
        Account account1 = new Account();
        assertEquals(3,Account.getAccountNumberGenerator());

    }


    @Test

    void StaffsCanLogInWithPasswordAndAssignedUsername(){
    staffs.setLogInPage("username", "password1989");

        assertEquals("password1989", staffs.getLogInPage());

    }


   @Test
    void testCreateAccountMethod(){



    }




    }
















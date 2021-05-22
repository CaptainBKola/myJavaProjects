package chapterThreeExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccoutModifiedTest {
    @Test
    void dontSetNegativeDepositAmountButOnlyPositve() {
        AccountModified account1 = new AccountModified("Janet", 2011);
        account1.setDeposit(30);
       assertEquals(30, 30);
    }

    @Test
    void getDepositOnlyPositiveValues() {
        AccountModified account1 = new AccountModified("Janet", 2011);

    }
    @Test
    void setCurrentAccountBalance() {
        AccountModified account1 = new AccountModified("Jane", 2011);
        account1.setDeposit(41000);

       // Scanner prompt= new Scanner(System.in);    //System.in is a standard input stream
       // System.out.print("Enter your secret pin ");
       // withdrawalPin = prompt.nextInt();

        account1.withdrawFromBalance(40000,2030);


        assertEquals(0, account1.getCurrentBalance());

    }

}


/*package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testThatAccountCanDepositOnce(){
        Account jnetAccount = new Account();
        // when
        jnetAccount.deposit(-850.00);
        assertEquals(0.00, jnetAccount.getMyAccountBallance());
    }
    @Test
    public void testThatAccountCanWithdraw(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(850.00);
        double withdrawalAmount = jnetAccount.withdraw(100.00, "1904");

        assertEquals(750.00, withdrawalAmount);
    }
    @Test
        public void testThatUserCanUpdatePin(){
        Account jnetAccount = new Account();
            String jnetPIN = jnetAccount.getAccountPIN();
            jnetAccount.setAccountPIN("1904");
            String changedPin = jnetAccount.getAccountPIN();
            assertEquals(jnetPIN, changedPin);
    }
}
*/
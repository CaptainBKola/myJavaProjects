package BankProject;

public class Account {

    private static int  accountNumberGenerator = 0;

   static int balance;

    // Constructor
    public Account() {
        accountNumberGenerator++;
    }

    public static int getAccountNumberGenerator() {
        return accountNumberGenerator;
    }

    public static void deposit(int amountToDeposit) {
     balance = amountToDeposit + balance ;

    }
    public static void setWithdraw(int amountToWithdraw) {
        balance = balance-amountToWithdraw;
    }



    public int getDeposit() {
        return balance;

    }

    public int getWithdraw() {

      return balance;

    }
    public static void setTransfer( int amount) {
      balance = balance-amount;

    }

    public int getTransfer(){

        return balance;

    }

    public static void loadAirtime(int amount, String phoneNumber){
        balance = balance - amount;


    }
    public int getLoadAirtime(){

        return balance;
    }

/*
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +" account no="+ accountNumberGenerator+
                '}';

    }

 */

}
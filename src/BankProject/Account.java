package BankProject;

public class Account {


    String  accountNumber;
    int balance;

    // Constructor
    public Account(int initialBalance,String accNumber) {
        balance = initialBalance;
        accountNumber = accNumber;
    }
    public  void deposit(int amountToDeposit) {

     balance = amountToDeposit + balance ;

    }
    public void setWithdraw(int amountToWithdraw) {
        balance = balance-amountToWithdraw;
    }

    public int getDeposit() {
        return balance;

    }

    public int getWithdraw() {

      return balance;

    }
    public void setTransfer( int amount) {
      balance = balance-amount;

    }

    public int getTransfer(){

        return balance;

    }

    public void loadAirtime(int amount, String phoneNumber){
        balance = balance - amount;


    }
    public int getLoadAirtime(){

        return balance;
    }


    /*
public int openNewAccount(String customerName, int openingBalance) {
BankAccount bank = new BankAccount(customerName, openingBalance);
boolean isAccountFound = false;
int i = 0;
while(isAccountFound == false && i < accounts.length)
{
   if(userInput == 5){
    isAccountFound = true;
    isMarkedForDeletion = true;
     accounts[accountNo - 1] = null;
  } add conditions for this account to replace the old one.
  // hint: use the isMarkedForDeletion field!
  // Finally add the new value assignment ( accounts[i] = ... )
  // return the account number.
}
// This will happen in the case there were no matches.
accounts[numOfAccounts] = b;
numOfAccounts++;
return b.getAccountNum();
}
    public void deleteAccount(int accountNo) {
       // accounts[accountNo - 1] = null;
    }

*/





}
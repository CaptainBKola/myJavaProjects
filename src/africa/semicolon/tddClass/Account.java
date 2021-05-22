/*package africa.semicolon.tddClass;

public class Account {
    private double myAccountBallance;
    private String accountPIN = "1904";

    public double getMyAccountBallance() {
        return myAccountBallance;
    }

    public void setMyAccountBallance(double myAccountBallance) {
        this.myAccountBallance = myAccountBallance;
    }

    public void deposit(double  amountToDeposit) {
        boolean negativeDeposit = amountToDeposit < 0;
        if(negativeDeposit){
            System.out.println("Invalid amount, please enter value greater than zero");
        }else {
            this.myAccountBallance += amountToDeposit;
        }

    }

    public double withdraw(double withdrawalAmount, String accountPIN) {
        boolean validPIN = accountPIN.equals(this.accountPIN);
        boolean negativeWithdrawal = withdrawalAmount < 0;
        boolean  withdrawalAboveBallance = withdrawalAmount > myAccountBallance;
        if(validPIN) {
            if (negativeWithdrawal) {
                System.out.println("Invalid amount, please enter value greater than zero");
            } else if (withdrawalAboveBallance) {
                System.out.println("Insufficient balance");
            } else {
                this.myAccountBallance = myAccountBallance - withdrawalAmount;
            }
        }
        else {
            System.out.println("Invalid PIN");
        }
        return this.myAccountBallance;
    }

    public String getAccountPIN() {
        return accountPIN;
    }

    public void setAccountPIN(String accountPIN) {
        if(this.accountPIN.equals(accountPIN))
        this.accountPIN = accountPIN;
    }
}
*/
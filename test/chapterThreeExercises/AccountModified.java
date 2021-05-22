package chapterThreeExercises;


public class AccountModified {
    private  int pin = 2030;
    private int currentBalance;

    public AccountModified(String name,int year){

    }

    public void setDeposit(int amountTodeposit){
        if (amountTodeposit < 0) {
            System.out.print("Customer cannot deposit a negative amount");
        }
            else if (amountTodeposit>0){
                currentBalance = currentBalance+ amountTodeposit;

            }
        }



    public int getCurrentBalance() {
        return currentBalance;
    }

    public void withdrawFromBalance(int amount,int withdrawalPin) {




        if (pin == withdrawalPin) {
            final int TRANSFER_FEE = 1000;
            amount = amount + TRANSFER_FEE;

            if (amount < 0) {
                System.out.print("error withdrawing negative amount");
            } else if (amount > currentBalance) {
                System.out.print("account balance is lesser than the amount you entered");
            } else {

                currentBalance = currentBalance - amount;
            }

        }
        else
        {
            System.out.print("enter a valid pin");
        }
    }

}


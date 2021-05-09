package africa.semicolon.tddClass;

public class Janet{
    private double  myBalance;
    public void deposit(double amountDemos) {
        myBalance = amountDemos + myBalance;

    }

    public double getMyBalance(){

        return myBalance;
    }


}

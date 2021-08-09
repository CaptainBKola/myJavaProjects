package compostion;

public class Macbook {
    private boolean isTurned;

    public Macbook(boolean isTurned){

        this.isTurned = isTurned;
    }

    public void isOn(boolean isTurned) {
        this.isTurned = isTurned;

    }

    public boolean getIsOn() {


        return isTurned;
    }
}

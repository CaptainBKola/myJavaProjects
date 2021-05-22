package africa.semicolon.tddClass;

public class Television {


    public Television(int year, String productName) {

    }


    private  boolean isOn;
    private int defaultV;
    private int channels;

    public void setOn(boolean tvOn) {
      isOn = tvOn;
    }



    public boolean getTvOnOff() {
        if (isOn ){
            isOn = isOn;
        }
        else if (!isOn){
            isOn = isOn;
        }
        return isOn;
    }

    public void setVolume(int volume) {


        defaultV = volume;
    }


    public int increaseV() {
        if (isOn){
            final int INCREASE_VOLUME_BY_ONE = 1;
            defaultV = defaultV + INCREASE_VOLUME_BY_ONE;
        }
        return defaultV;
    }

    public int decreaseV() {
        if (isOn){
            final int DECREASE_VOLUME_BY_ONE = 1 ;
            defaultV = defaultV - DECREASE_VOLUME_BY_ONE;
        }
        return defaultV;
    }


    public void setChanels(int channelsPlus) {
        final int maxValue = 50;
        if (channelsPlus <= maxValue) {
            channels = channelsPlus;
        } else
            channels = 0;
    }
    public int increaseChannels() {
        if (isOn){

            channels = channels + 1;
        }
        return channels;
    }


    public int decreaseChannels() {
        if (isOn){
            channels = channels-1;
        }
        return channels;
    }


}













package computer.component.output.concrete;

import computer.component.output.Headphones;

public class HeadphonesImpl implements Headphones {

    private boolean wireless;
    private boolean microphone;
    private int price;

    public HeadphonesImpl(boolean wireless, boolean microphone, int price) {
        this.wireless = wireless;
        this.microphone = microphone;
        this.price = price;
    }

    @Override
    public boolean isWireless() {
        return wireless;
    }

    @Override
    public boolean hasMicrophone() {
        return microphone;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

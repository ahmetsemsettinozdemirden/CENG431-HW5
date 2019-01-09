package computer.component.input.concrete;

import computer.component.input.Mouse;

public class MouseImpl implements Mouse {

    private boolean wireless;
    private int price;

    public MouseImpl(boolean wireless, int price) {
        this.wireless = wireless;
        this.price = price;
    }

    @Override
    public boolean isWireless() {
        return wireless;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

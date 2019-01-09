package computer.component.input.concrete;

import computer.component.input.Keyboard;

public class KeyboardImpl implements Keyboard {

    private int numberOfKeys;
    private boolean backlight;
    private int price;

    public KeyboardImpl(int numberOfKeys, boolean backlight, int price) {
        this.numberOfKeys = numberOfKeys;
        this.backlight = backlight;
        this.price = price;
    }

    @Override
    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public boolean hasBacklight() {
        return backlight;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

package computer.component.hardware.concrete;

import computer.component.hardware.RAM;

public class RAMImpl implements RAM {

    private String capacity;
    private int price;

    public RAMImpl(String capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

package computer.component.output.concrete;

import computer.component.output.Monitor;

public class MonitorImpl implements Monitor {

    private double inch;
    private int price;

    public MonitorImpl(double inch, int price) {
        this.inch = inch;
        this.price = price;
    }

    @Override
    public double getInch() {
        return inch;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

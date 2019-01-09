package computer.component.hardware.concrete;

import computer.component.hardware.CPU;

public class CPUImpl implements CPU {

    private String version;
    private String frequency;
    private int price;

    public CPUImpl(String version, String frequency, int price) {
        this.version = version;
        this.frequency = frequency;
        this.price = price;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String getFrequency() {
        return frequency;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

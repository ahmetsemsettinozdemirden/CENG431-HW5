package computer.factory.decorator;

import computer.factory.Computer;

public class ComputerWithGoldCable extends ComputerDecorator {

    public ComputerWithGoldCable(Computer computer) {
        super(computer);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() * 6;
    }

    @Override
    public String getCable() {
        return "gold";
    }

}

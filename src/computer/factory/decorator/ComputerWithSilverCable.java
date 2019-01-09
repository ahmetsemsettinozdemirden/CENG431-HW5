package computer.factory.decorator;

import computer.factory.Computer;

public class ComputerWithSilverCable extends ComputerDecorator {

    public ComputerWithSilverCable(Computer computer) {
        super(computer);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 350;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() * 4;
    }

    @Override
    public String getCable() {
        return "silver";
    }

}

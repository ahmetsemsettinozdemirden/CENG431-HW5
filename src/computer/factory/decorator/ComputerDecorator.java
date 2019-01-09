package computer.factory.decorator;

import computer.component.hardware.CPU;
import computer.component.hardware.RAM;
import computer.component.input.Keyboard;
import computer.component.input.Mouse;
import computer.component.output.Headphones;
import computer.component.output.Monitor;
import computer.factory.Computer;

public abstract class ComputerDecorator implements Computer {

    private Computer wrappee;

    public ComputerDecorator(Computer computer) {
        this.wrappee = computer;
    }

    @Override
    public CPU getCPU() {
        return wrappee.getCPU();
    }

    @Override
    public RAM getRAM() {
        return wrappee.getRAM();
    }

    @Override
    public Keyboard getKeyboard() {
        return wrappee.getKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return wrappee.getMouse();
    }

    @Override
    public Headphones getHeadphones() {
        return wrappee.getHeadphones();
    }

    @Override
    public Monitor getMonitor() {
        return wrappee.getMonitor();
    }

    @Override
    public int getPrice() {
        return wrappee.getPrice();
    }

    @Override
    public int getSpeed() {
        return wrappee.getSpeed();
    }

    @Override
    public String getCable() {
        return wrappee.getCable();
    }

    @Override
    public String toString() {
        return wrappee.toString();
    }
}

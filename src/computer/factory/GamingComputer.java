package computer.factory;

import computer.component.hardware.CPU;
import computer.component.hardware.RAM;
import computer.component.input.Keyboard;
import computer.component.input.Mouse;
import computer.component.output.Headphones;
import computer.component.output.Monitor;

public class GamingComputer implements Computer {

    private CPU cpu;
    private RAM ram;
    private Keyboard keyboard;
    private Mouse mouse;
    private Headphones headphones;
    private Monitor monitor;

    public GamingComputer(CPU cpu, RAM ram, Keyboard keyboard, Mouse mouse, Headphones headphones, Monitor monitor) {
        this.cpu = cpu;
        this.ram = ram;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.headphones = headphones;
        this.monitor = monitor;
    }

    @Override
    public CPU getCPU() {
        return cpu;
    }

    @Override
    public RAM getRAM() {
        return ram;
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public Mouse getMouse() {
        return mouse;
    }

    @Override
    public Headphones getHeadphones() {
        return headphones;
    }

    @Override
    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public int getPrice() {
        return cpu.getPrice() + ram.getPrice() + keyboard.getPrice() + mouse.getPrice() + headphones.getPrice()
                + monitor.getPrice();
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String getCable() {
        return "copper";
    }

    @Override
    public String toString() {
        return "Gaming Computer";
    }
}

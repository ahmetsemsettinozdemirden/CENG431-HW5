package computer.factory;

import computer.component.hardware.CPU;
import computer.component.hardware.RAM;
import computer.component.hardware.concrete.CPUImpl;
import computer.component.hardware.concrete.RAMImpl;
import computer.component.input.Keyboard;
import computer.component.input.Mouse;
import computer.component.input.concrete.KeyboardImpl;
import computer.component.input.concrete.MouseImpl;
import computer.component.output.Headphones;
import computer.component.output.Monitor;
import computer.component.output.concrete.HeadphonesImpl;
import computer.component.output.concrete.MonitorImpl;

import java.util.Random;

public class GamingComputerFactory implements ComputerFactory {

    private Random random;

    public GamingComputerFactory() {
        this.random = new Random();
    }

    @Override
    public Computer createComputer() {
        return new GamingComputer(createCPU(), createRAM(), createKeyboard(), createMouse(), createHeadphones(), createMonitor());
    }

    private CPU createCPU() {
        String[] versionList = { "i5", "i7" };
        String version = versionList[random.nextInt(versionList.length)];
        int price = getRandom(14000, 24000);
        return new CPUImpl(version, "7.2 Ghz", price);
    }

    private RAM createRAM() {
        String[] capacityList = { "128 GB", "256 GB" };
        String capacity = capacityList[random.nextInt(capacityList.length)];
        int price = getRandom(7000, 19000);
        return new RAMImpl(capacity, price);
    }

    private Keyboard createKeyboard() {
        int numberOfKeys = getRandom(84, 108);
        int price = getRandom(500, 1500);
        return new KeyboardImpl(numberOfKeys, true, price);
    }

    private Mouse createMouse() {
        int price = getRandom(27, 78);
        return new MouseImpl(true, price);
    }

    private Headphones createHeadphones() {
        int price = getRandom(600, 1900);
        return new HeadphonesImpl(true, true, price);
    }

    private Monitor createMonitor() {
        int[] inchList = { 18, 21, 25, 27 };
        int inch = inchList[random.nextInt(inchList.length)];
        int price = getRandom(2500, 3500);
        return new MonitorImpl(inch, price);
    }

    private int getRandom(int from, int to) {
        return from + random.nextInt(to - from);
    }

}

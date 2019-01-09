package computer.presentation;

import computer.component.hardware.CPU;
import computer.component.hardware.RAM;
import computer.component.input.Keyboard;
import computer.component.input.Mouse;
import computer.component.output.Headphones;
import computer.component.output.Monitor;
import computer.factory.Computer;

public class ComputerViewerImpl implements ComputerViewer {

    public void printComputer(Computer computer) {
        System.out.println(computer);
        System.out.println(getCPUText(computer.getCPU()));
        System.out.println(getRAMText(computer.getRAM()));
        System.out.println(getKeyboardText(computer.getKeyboard()));
        System.out.println(getMouseText(computer.getMouse()));
        System.out.println(getHeadphonesText(computer.getHeadphones()));
        System.out.println(getMonitorText(computer.getMonitor()));
        System.out.println(getPriceText(computer.getPrice()));
        System.out.println(getSpeedText(computer.getSpeed()));
        System.out.println(getCableText(computer.getCable()));
        System.out.println("-------------------------");
    }

    public String getCPUText(CPU cpu) {
        return "CPU\n  version: " + cpu.getVersion() + "\n  frequency: " + cpu.getFrequency() + "\n  price: " + cpu.getPrice();
    }

    public String getRAMText(RAM ram) {
        return "RAM\n  capacity: " + ram.getCapacity() + "\n  price: " + ram.getPrice();
    }

    public String getKeyboardText(Keyboard keyboard) {
        return "Keyboard\n  number of keys: " + keyboard.getNumberOfKeys() + "\n  backlight: " + keyboard.hasBacklight() + "\n  price: " + keyboard.getPrice();
    }

    public String getMouseText(Mouse mouse) {
        return "Mouse\n  wireless: " + mouse.isWireless() + "\n  price: " + mouse.getPrice();
    }

    public String getHeadphonesText(Headphones headphones) {
        return "Headphones\n  wireless: " + headphones.isWireless() + "\n  microphone: " + headphones.hasMicrophone() + "\n  price: " + headphones.getPrice();
    }

    public String getMonitorText(Monitor monitor) {
        return "Monitor\n  inch: " + monitor.getInch() + "\n  price: " + monitor.getPrice();
    }

    public String getPriceText(int price) {
        return "total price: " + price;
    }

    public String getSpeedText(int speed) {
        return "speed: " + speed;
    }

    public String getCableText(String cable) {
        return "cable type: " + cable;
    }

}

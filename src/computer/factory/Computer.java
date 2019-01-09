package computer.factory;

import computer.component.hardware.CPU;
import computer.component.hardware.RAM;
import computer.component.input.Keyboard;
import computer.component.input.Mouse;
import computer.component.output.Headphones;
import computer.component.output.Monitor;

public interface Computer {

    // hardware
    CPU getCPU();
    RAM getRAM();

    // input
    Keyboard getKeyboard();
    Mouse getMouse();

    // output
    Headphones getHeadphones();
    Monitor getMonitor();

    int getPrice();
    int getSpeed();
    String getCable();

}

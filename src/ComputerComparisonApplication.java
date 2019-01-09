import computer.presentation.ComputerViewer;
import computer.presentation.ComputerViewerImpl;
import computer.factory.Computer;
import computer.factory.ComputerFactory;
import computer.factory.GamingComputerFactory;
import computer.factory.RegularComputerFactory;
import computer.factory.decorator.ComputerWithGoldCable;
import computer.factory.decorator.ComputerWithSilverCable;

public class ComputerComparisonApplication {

    public static void main(String[] args) {

        ComputerFactory regularComputerFactory = new RegularComputerFactory();
        ComputerFactory gamingComputerFactory = new GamingComputerFactory();

        Computer regularComputer = regularComputerFactory.createComputer();
        Computer gamingComputer = gamingComputerFactory.createComputer();

        Computer silverRegularComputer = new ComputerWithSilverCable(regularComputer);
        Computer goldGamingComputer = new ComputerWithGoldCable(gamingComputer);

        ComputerViewer computerViewer = new ComputerViewerImpl();
        computerViewer.printComputer(silverRegularComputer);
        computerViewer.printComputer(goldGamingComputer);
    }

}

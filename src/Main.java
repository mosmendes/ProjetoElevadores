import controller.ElevatorController;
import factory.ElevatorFactory;
import model.Elevator;
import state.StuckState;


public class Main {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController();

        Elevator elevator1 = ElevatorFactory.createElevator("A");
        Elevator elevator2 = ElevatorFactory.createElevator("B");

        controller.registerElevator(elevator1);
        controller.registerElevator(elevator2);

        controller.moveElevator("A", 5);
        controller.moveElevator("B", 3);

        elevator1.setState(StuckState.getInstance());
        elevator1.requestAction();
    }
}

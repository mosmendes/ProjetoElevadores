package state;
import model.Elevator;

public class MovingDownState implements ElevatorState {
    private static final MovingDownState instance = new MovingDownState();

    private MovingDownState() {}

    public static MovingDownState getInstance() {
        return instance;
    }

    public void handle(Elevator elevator) {
        System.out.println("Elevador " + elevator.getId() + " descendo.");
    }
}

package state;
import model.Elevator;

public class MovingUpState implements ElevatorState {
    private static final MovingUpState instance = new MovingUpState();

    private MovingUpState() {}

    public static MovingUpState getInstance() {
        return instance;
    }

    public void handle(Elevator elevator) {
        System.out.println("Elevador " + elevator.getId() + " subindo.");
    }
}
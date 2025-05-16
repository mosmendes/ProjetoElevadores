package state;
import model.Elevator;

public class IdleState implements ElevatorState {
    private static final IdleState instance = new IdleState();

    private IdleState() {}

    public static IdleState getInstance() {
        return instance;
    }

    public void handle(Elevator elevator) {
        System.out.println("Elevador " + elevator.getId() + " está parado.");
    }
}
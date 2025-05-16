package state;
import model.Elevator;

public interface ElevatorState {
    void handle(Elevator elevator);
}
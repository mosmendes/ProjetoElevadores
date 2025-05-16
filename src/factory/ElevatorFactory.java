package factory;
import model.Elevator;

public class ElevatorFactory {
    public static Elevator createElevator(String id) {
        return new Elevator(id);
    }
}

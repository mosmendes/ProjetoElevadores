package observer;
import model.Elevator;

public interface Observer {
    void update(Elevator elevator, String message);
}
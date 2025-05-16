package observer;
import model.Elevator;

public class SecuritySystem implements Observer {
    public void update(Elevator elevator, String message) {
        System.out.println("[Segurança] Notificação: " + message + " - Elevador " + elevator.getId());
    }
}
package observer;
import model.Elevator;

public class MaintenanceSystem implements Observer {
    public void update(Elevator elevator, String message) {
        System.out.println("[Manutenção] Notificação: " + message + " - Elevador " + elevator.getId());
    }
}
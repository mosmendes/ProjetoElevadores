package controller;
import java.util.*;

import model.Elevator;

public class ElevatorController {

    private Map<String, Elevator> elevators = new HashMap<>();

    public ElevatorController() {}

    public void registerElevator(Elevator elevator) {
        elevators.put(elevator.getId(), elevator);
    }

    public void moveElevator(String id, int floor) {
        Elevator elevator = elevators.get(id);
        if (elevator != null) {
            elevator.moveToFloor(floor);
        }
    }
}
package model;
import java.util.*;

import observer.MaintenanceSystem;
import observer.Observer;
import observer.SecuritySystem;
import observer.Subject;
import state.ElevatorState;
import state.IdleState;
import state.MovingDownState;
import state.MovingUpState;
import strategy.MusicStrategy;
import strategy.NoMusic;

public class Elevator implements Subject {
    private String id;
    private int currentFloor = 0;
    private ElevatorState state = IdleState.getInstance();
    private List<Observer> observers = new ArrayList<>();
    private MusicStrategy musicStrategy = new NoMusic();

    public Elevator(String id) {
        this.id = id;
        addObserver(new SecuritySystem());
        addObserver(new MaintenanceSystem());
    }

    public String getId() {
        return id;
    }

    public void moveToFloor(int floor) {
        if (floor > currentFloor) {
            setState(MovingUpState.getInstance());
        } else if (floor < currentFloor) {
            setState(MovingDownState.getInstance());
        } else {
            setState(IdleState.getInstance());
        }
        this.currentFloor = floor;
        requestAction();
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public void requestAction() {
        state.handle(this);
    }

    public void setMusicStrategy(MusicStrategy strategy) {
        this.musicStrategy = strategy;
    }

    public void playMusic() {
        musicStrategy.play();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(this, message);
        }
    }
}
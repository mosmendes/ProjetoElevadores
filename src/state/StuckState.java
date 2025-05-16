package state;
import model.Elevator;
import strategy.CalmingMusic;

public class StuckState implements ElevatorState {
    private static final StuckState instance = new StuckState();

    private StuckState() {}

    public static StuckState getInstance() {
        return instance;
    }

    public void handle(Elevator elevator) {
        System.out.println("Elevador " + elevator.getId() + " emperrado!");
        elevator.notifyObservers("Elevador emperrado!");
        elevator.setMusicStrategy(new CalmingMusic());
        elevator.playMusic();
    }
}


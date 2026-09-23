package ElevatorSystem;

public class UserRequest {
    int currentFloor;
    Direction direction;

    public UserRequest(int currentFloor, Direction direction) {
        this.currentFloor = currentFloor;
        this.direction = direction;
    }
}

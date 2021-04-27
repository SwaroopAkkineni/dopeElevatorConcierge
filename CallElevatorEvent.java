public class CallElevatorEvent implements ElevatorEvent {
	static int floor;
	static ElevatorDirection direction; // true is up, false is down

	public CallElevatorEvent(int floor, boolean direction) {
		this.floor = floor;

    if(direction)
		  this.direction = ElevatorDirection.UP;
    else
      this.direction = ElevatorDirection.DOWN;
	}
}

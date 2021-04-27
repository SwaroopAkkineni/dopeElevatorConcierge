public class CallElevatorEvent implements ElevatorEvent {
	static int floor;
	static boolean direction; // true is up, false is down

	public CallElevatorEvent(int floor, boolean direction) {
		this.floor = floor;
		this.direction = direction;
	}
}

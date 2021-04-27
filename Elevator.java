public class Elevator {
	int floor;
	ElevatorDirection direction;

	public Elevator(int floor) {
		this.floor = floor;
		direction = ElevatorDirection.IDLE;
	}

  public static void handleElevantEvent(ElevatorEvent elevatorEvent) {
		if (elevatorEvent instanceof CallElevatorEvent) {
				System.out.println("CallElevatorEvent");
		} else if (elevatorEvent instanceof PressFloorEvent) {
				System.out.println("PressFloorEvent");
		}
	}

  public void print() {
    System.out.println(this.floor + " " + this.direction);
  }
}

enum ElevatorDirection {
	UP,
	IDLE,
	DOWN
}

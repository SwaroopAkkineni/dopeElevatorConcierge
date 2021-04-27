public class Elevator {
	int maxFloor;
	int floor;
	ElevatorDirection direction;
	// Set<Integer>

	public Elevator(int maxFloor, int startingFloor) {
		this.maxFloor = maxFloor;
		this.floor = startingFloor;
		direction = ElevatorDirection.IDLE;
	}

	public Elevator(int maxFloor) {
		this.maxFloor = maxFloor;
		this.floor = 0;
		direction = ElevatorDirection.IDLE;
	}

  public void handleElevatorEvent(ElevatorEvent elevatorEvent) {
		if (elevatorEvent instanceof CallElevatorEvent) {
				handleCallElevatorEvent((CallElevatorEvent) elevatorEvent);
		} else if (elevatorEvent instanceof PressFloorEvent) {
				handlePressFloorEvent((PressFloorEvent) elevatorEvent);
		}
	}

	private void handleCallElevatorEvent(CallElevatorEvent event) {
		System.out.println("CallElevatorEvent");
	}

	private void handlePressFloorEvent(PressFloorEvent event) {
		System.out.println("PressFloorEvent");
	}

	public void decrement() {
		if(this.floor > 0)
			this.floor--;

		print();
	}

	public void increment() {
		if(this.floor < this.maxFloor)
			this.floor++;

		print();
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

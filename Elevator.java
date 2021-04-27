import java.util.Set;
import java.util.HashSet;

public class Elevator {
	int maxFloor;
	int floor;
	ElevatorDirection direction;
	Set<Integer> currentPath;
	Set<Integer> nextPath;

	public Elevator(int maxFloor, int startingFloor) {
		this.maxFloor = maxFloor;
		this.floor = startingFloor;
		this.direction = ElevatorDirection.IDLE;
		this.currentPath = new HashSet<>();
		this.nextPath = new HashSet<>();
	}

	public Elevator(int maxFloor) {
		this.maxFloor = maxFloor;
		this.floor = 0;
		direction = ElevatorDirection.UP;
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

	public void traverse() {
		switch (this.direction) {
				case UP:
						increment();
						break;
				case DOWN:
						decrement();
						break;
				default:
					// do noth
		}

		if()
		print();
	}

	public void decrement() {
		if(this.floor > 0)
			this.floor--;
	}

	public void increment() {
		if(this.floor < this.maxFloor)
			this.floor++;
	}

  private void print() {
    System.out.println(this.floor + " " + this.direction);
  }
}

enum ElevatorDirection {
	UP,
	IDLE,
	DOWN
}

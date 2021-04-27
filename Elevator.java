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
		direction = ElevatorDirection.IDLE;
		this.currentPath = new HashSet<>();
		this.nextPath = new HashSet<>();
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

		if(direction == ElevatorDirection.IDLE) {
			handleIdle(event.floor);
		} else if(event.direction != this.direction) {
			nextPath.add(event.floor);
		} else {
			currentPath.add(event.floor);
		}
	}

	private void handlePressFloorEvent(PressFloorEvent event) {
		System.out.println("PressFloorEvent");

		if(direction == ElevatorDirection.IDLE) {
			handleIdle(event.floor);
		} else if(event.floor > this.floor) {
			currentPath.add(event.floor);
		} else {
			nextPath.add(event.floor);
		}
	}

	private void handleIdle(int floor) {
		currentPath.add(floor);

		if(floor > this.floor)
			direction = ElevatorDirection.UP;
		else
			direction = ElevatorDirection.DOWN;
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

		if(currentPath.contains(this.floor))
			currentPath.remove(this.floor);

		if(currentPath.isEmpty())
			this.direction = ElevatorDirection.IDLE;


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

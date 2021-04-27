public class SwaroopsAmazingElevatorConcierge {
	public static void main(String[] args){
		System.out.println("Welcome to Swaroop's Amazing Elevator Concierge!");

		// elevator.handleElevatorEvent(new CallElevatorEvent(10, true));
		// elevator.handleElevatorEvent(new PressFloorEvent(100));

		// for(int i = 0; i < 10; i++) {
		// 	elevator.increment();
		// }
		//
		// for(int i = 0; i < 10; i++) {
		// 	elevator.decrement();
		// }

		// for(int i = 0; i < 20; i++) {
		// 	elevator.traverse();
		// }

		Elevator elevator = new Elevator(10);
		elevator.handleElevatorEvent(new CallElevatorEvent(10, false));
		for(int i = 0; i < 10; i++) {
			elevator.traverse();
		}

		elevator.handleElevatorEvent(new PressFloorEvent(5));
		for(int i = 0; i < 10; i++) {
			elevator.traverse();
		}
		System.out.println("----------------------------------");

		elevator = new Elevator(10, 7);
		elevator.handleElevatorEvent(new CallElevatorEvent(5, false));
		for(int i = 0; i < 10; i++) {
			elevator.traverse();
		}

		elevator.handleElevatorEvent(new PressFloorEvent(8));
		for(int i = 0; i < 10; i++) {
			elevator.traverse();
		}
  }
}

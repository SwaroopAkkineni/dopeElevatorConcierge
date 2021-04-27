public class SwaroopsAmazingElevatorConcierge {
	public static void main(String[] args){
		System.out.println("Welcome to Swaroop's Amazing Elevator Concierge!");
		Elevator elevator = Elevator(100);

		elevator.print();

		elevator.handleElevantEvent(new CallElevatorEvent(10, true));
		elevator.handleElevantEvent(new PressFloorEvent(100));
  }
}

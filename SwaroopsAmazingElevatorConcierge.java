public class SwaroopsAmazingElevatorConcierge {
  public static void main(String[] args) {
    System.out.println("Welcome to Swaroop's Amazing Elevator Concierge!");

    Elevator elevator = new Elevator(10);
    elevator.handleElevatorEvent(new CallElevatorEvent(10, false));
    for (int i = 0; i < 5; i++) {
      elevator.traverse();
    }
    elevator.handleElevatorEvent(new CallElevatorEvent(4, false));
    for (int i = 0; i < 1; i++) {
      elevator.traverse();
    }
    elevator.handleElevatorEvent(new CallElevatorEvent(8, true));
    for (int i = 0; i < 2; i++) {
      elevator.traverse();
    }

    elevator.handleElevatorEvent(new PressFloorEvent(5));
    for (int i = 0; i < 20; i++) {
      elevator.traverse();
    }

    System.out.println("------------------------------------------");

    elevator = new Elevator(10, 10);
    elevator.handleElevatorEvent(new CallElevatorEvent(9, false));
    for (int i = 0; i < 5; i++) {
      elevator.traverse();
    }
    elevator.handleElevatorEvent(new PressFloorEvent(10));
    elevator.handleElevatorEvent(new CallElevatorEvent(4, false));
    for (int i = 0; i < 1; i++) {
      elevator.traverse();
    }

    elevator.handleElevatorEvent(new CallElevatorEvent(1, false));
    elevator.handleElevatorEvent(new CallElevatorEvent(4, false));

    for (int i = 0; i < 2; i++) {
      elevator.traverse();
    }

    elevator.handleElevatorEvent(new PressFloorEvent(5));
    elevator.handleElevatorEvent(new PressFloorEvent(3));
    for (int i = 0; i < 20; i++) {
      elevator.traverse();
    }
  }
}

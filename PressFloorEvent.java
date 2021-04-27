public class PressFloorEvent implements ElevatorEvent {
  static int floor;

  public PressFloorEvent(int floor) {
    this.floor = floor;
  }
}


public class Truck extends Automobile {
  public Truck(String color) {
    super(color);
  }

  public void whatAmI() {
    System.out.println("I am a large " + String.valueOf(getWheels())
        + " wheeled " + getColor() + " truck");
  }
}


public class Motorcycle extends Automobile {
  public Motorcycle(String color) {
    super(color);
    setWheels(2);
  }

  public void whatAmI() {
    System.out.println("I am a small " + String.valueOf(getWheels())
        + " wheeled " + getColor() + " motorcycle");
  }
}
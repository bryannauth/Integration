
//Bryan Nauth
//child class of automobile

public class Truck extends Automobile {
  // polymorphism
  public Truck(String color) {
    super(color);
  }

  // overridden method from automobile class
  public void whatAmI() {
    System.out.println(
        "I am a large " + String.valueOf(getWheels()) + " wheeled " + getColor() + " truck");
  }
}

//child of automobile
public class Motorcycle extends Automobile {
  //polymorphism
  public Motorcycle(String color) {
    super(color);
    setWheels(2);
  }
//overridden method taken from automobile class
  public void whatAmI() {
    System.out.println("I am a small " + String.valueOf(getWheels())
        + " wheeled " + getColor() + " motorcycle");
  }
}
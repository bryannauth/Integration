
//Bryan Nauth
//parent class
/**
 * Creates the Automobile class and initializes String color and int wheels.
 * 
 */
public class Automobile {
  private int wheels = 4;
  private String color;

  /**
   * This method assigns a color to this instance of the Automobile class and displays text after.
   */
  public Automobile(String color) {
    this.color = color;
    System.out.println("Vroom Vroom");
  }

  /**
   * Method to tell the user what kind of Automobile the program created.
   */
  public void whatAmI() {
    System.out.println("I am a " + String.valueOf(wheels) + " wheeled " + color + " automobile");
    // overriding into Truck and Motorcycle (polymorphism)
  }

  // sets the amount of wheels, 4 for trucks/cars and 2 for motorcycles
  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  // gets/returns the amount of wheels
  public int getWheels() {
    return wheels;
  }

  // gets/returns the color of the vehicle
  public String getColor() {
    return color;
  }

}

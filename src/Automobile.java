public class Automobile {
  private int wheels = 4;
  private String color;

  public Automobile(String color) {
    this.color = color;
    System.out.println("Vroom Vroom");
  }

  public void whatAmI() {
    System.out.println("I am a " + String.valueOf(wheels) + " wheeled " + color
        + " automobile");
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getWheels() {
    return wheels;
  }

  public String getColor() {
    return color;
  }

}

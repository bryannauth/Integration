
//Bryan Nauth
//My project will convert measurements, manipulate an array, include a game, and educate the user

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;
import java.util.function.Predicate;

@SuppressWarnings("unused")
public class Main {

  public static double conversionIn(double number) {
    number = number * (double) 2.54;
    return number;
  }

  public static double conversionCm(double number) {
    number = number / (double) 2.54;
    return number;
  }

  private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

  /**
   * This is the main method that implements all the other parts of the code, in it I have a brief
   * description of the different types of variables as well as the entirety of the metric/imperial
   * converter.
   */
  public static void main(String[] args) {

    System.out
        .println("Hello! Thank you for choosing Bryan's Metric/Imperial Converter, Array Buddy,"
            + "Navigation Game, and more!");

    // in java a variable is a placeholder for something else
    // Byte: 8 bit -128-127
    // Short: 16 bit -32768-32767
    // Int: 32 bit 0-2^32-1
    // Long: 64 bit -0 - 2^64-1
    // Float: 32 bit
    // Double: 64 bit
    // Boolean: true/false
    // Char: 16 unicode
    // String: character strings
    // Default= 0/null/false
    LocalDateTime now = LocalDateTime.now();
    System.out.println(dtf.format(now));
    Scanner reader = new Scanner(System.in);
    System.out.println(
        "Please type 'in' to convert from inches or 'cm' to " + "convert from centimeters");
    String conversion = reader.next();
    conversion = conversion.toUpperCase();
    System.out.println("Enter your number: ");
    double number = reader.nextDouble();
    switch (conversion) {
      case "IN":
        number = conversionIn(number);
        System.out.println(number);
        break;
      case "CM":
        number = conversionCm(number);
        System.out.println(number);
        break;
      default:
        System.out.println("No input");
        break;
    }
    System.out.println("Would you like to find out what happens when you divide"
        + " 10 by 3 as integers? (yes or no)");
    String divide = reader.next();
    if (divide.contains("yes")) {
      int division = 10 / 3;
      System.out.println(division);
    } else {
      System.out.println("int can only contain whole numbers, therefore "
          + "dividing with integers is usually a bad idea");
    }

    int[] tmpArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    ArrayBuddy ab = new ArrayBuddy(tmpArray);
    System.out.println("The sum of the array is " + ArrayBuddy.getTotalSum() + ".");
    System.out.println("The smallest value in the array is " + ab.smallestValue() + ".");
    System.out.println("The number 8 can be found in the array at index " + ab.find(8) + ".");

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      sb.append(tmpArray[i]);
    }
    sb.reverse();
    String sbString = sb.toString();
    System.out.println("Our array reversed is: " + sbString + ".");

    NavigationGame ng = new NavigationGame();

    while (ng.isPlay()) {
      ng.display();
      String move = reader.next();
      move = move.toUpperCase();
      ng.move(move);
    }
    System.out.println("Congratulations! You've completed the game!");
    Automobile a = new Automobile("Silver");
    a.whatAmI();
    Truck t = new Truck("Red");
    t.whatAmI();
    Motorcycle m = new Motorcycle("Blue");
    m.whatAmI();

    System.out.println("How old are you?");
    int age = reader.nextInt();
    Predicate<Integer> predicateTest = testInt -> {
      return (testInt >= 18) && (testInt < 65);
    };
    // Predicate Lambda expression that tests if the user is part of the
    // workforce or not by age (according to the US definition of working age)

    if (predicateTest.test(age)) {
      System.out.println("You should be working");
    } else {
      System.out.println("You don't need to be working");
    }
    reader.close();
  }
}

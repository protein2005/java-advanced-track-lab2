import annotations.Validator;

/**
 * The Main class demonstrates the usage of the Validator class
 * to validate objects of different classes using custom annotations.
 */
public class Main {

  /**
   * The main method is the entry point of the application.
   * It creates instances of Person, Product, and Car classes and validates them.
   */
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    try {
      Person person = new Person(null, 20);
      Validator.validate(person);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Product product = new Product("Laptop", "A");
      Validator.validate(product);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    long endTime = System.currentTimeMillis();
    long reflectionTime = endTime - startTime;
    System.out.println("Reflection completion time: " + reflectionTime + "ms");

    startTime = System.currentTimeMillis();
    try {
      Car car = new Car("Tesla Model S", 1940);
      car.validate();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Car car = new Car("A", 2022);
      car.validate();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    endTime = System.currentTimeMillis();
    long noReflectionTime = endTime - startTime;
    System.out.println("No reflection completion time: " + noReflectionTime + "ms");
  }
}

/**
 * The Car class represents a car with a model and year.
 * It uses custom validation.
 */
public class Car {

  String model;
  int year;

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }

  /**
   * Validates the fields of the Car instance based on the constraints.
   *
   * @throws IllegalArgumentException if any validation constraint is violated
   */
  public void validate() {
    if (model == null) {
      throw new IllegalArgumentException("Field 'model' in class Car cannot be null.");
    }
    if (model.length() < 3 || model.length() > 80) {
      throw new IllegalArgumentException("Field 'model' in class Car must have length between 3 and 80.");
    }
    if (year < 1960 || year > 2024) {
      throw new IllegalArgumentException("Field 'year' in class Car must be between 1960 and 2022.");
    }
  }
}

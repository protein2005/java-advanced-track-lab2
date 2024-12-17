import annotations.MaxValue;
import annotations.MinValue;
import annotations.NotNull;

/**
 * The Person class represents a person with a name and age.
 * It uses custom annotations to enforce validation constraints.
 */
public class Person {

  @NotNull
  String name;

  @MinValue(18)
  @MaxValue(100)
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

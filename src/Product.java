import annotations.NotNull;
import annotations.StringLength;

/**
 * The Product class represents a product with a title and description.
 * It uses custom annotations to enforce validation constraints.
 */
public class Product {

  @NotNull
  String title;

  @StringLength(min = 3, max = 100)
  String description;

  public Product(String title, String description) {
    this.title = title;
    this.description = description;
  }
}
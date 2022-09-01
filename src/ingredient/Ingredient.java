package ingredient;

import java.util.UUID;

public class Ingredient {
    private final String id;
    private String name;
    private int quantity;
    private double price;
    public static final Measure measure = Measure.GRAM;

    public Ingredient(String name, int quantity, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity + measure.name +
                ", price=" + price +
                '}';
    }


}
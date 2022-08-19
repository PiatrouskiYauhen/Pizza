package ingredient;

import java.util.UUID;

public class Ingredient {
    private final String id;
    private String name;
    private int weight;
    private double price;

    public Ingredient(String name, int weight, double price) {
        this(UUID.randomUUID().toString(), name, weight, price);
    }

    public Ingredient(String id, String name, int weight, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
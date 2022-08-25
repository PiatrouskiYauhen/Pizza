package ingredient;

import java.util.UUID;

public class Ingredient {
    private final String id;
    private String name;
    private int weight;
    private double price;
    private Measure measure;

    public Ingredient(String name, int weight, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.measure = Measure.GRAM;
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

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight + measure.name +
                ", price=" + price +
                '}';
    }


}
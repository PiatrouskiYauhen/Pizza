package ingredient;

import java.util.UUID;

public class Ingredient {
    private final String id;
    private String name;
    private int qantity;
    private double price;
    public static final Measure measure = Measure.GRAM;

    public Ingredient(String name, int qantity, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.qantity = qantity;
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

    public int getQantity() {
        return qantity;
    }

    public void setQantity(int qantity) {
        this.qantity = qantity;
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
                ", qantity=" + qantity + measure.name +
                ", price=" + price +
                '}';
    }


}
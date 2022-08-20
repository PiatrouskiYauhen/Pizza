package order;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class Order {
    private final String id;
    private final LocalDate date;
    private final String clientId;
    private OrderStatus orderStatus;
    private Map<String, Byte> recipes;
    private double price;

    public Order(String clientId, OrderStatus orderStatus, Map<String, Byte> recipes) {
        this.id = UUID.randomUUID().toString();
        this.date = LocalDate.now();
        this.clientId = clientId;
        this.orderStatus = orderStatus;
        this.recipes = recipes;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getClientId() {
        return clientId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Map<String, Byte> getRecipes() {
        return recipes;
    }

    public double getPrice() {
        return price;
    }
}
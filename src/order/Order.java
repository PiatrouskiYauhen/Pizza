package order;

import ingredient.IngredientStorage;
import recipe.RecipeGenerator;
import recipe.RecipeStorage;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Order {
    private final String id;
    private final LocalDate date;
    private final String clientId;
    private OrderStatus orderStatus;
    private Map<String, Byte> recipes;
    private double price;

    public Order(String clientId, Map<String, Byte> recipes) throws Exception {
        this.id = UUID.randomUUID().toString();
        this.date = LocalDate.now();
        this.clientId = clientId;
        this.orderStatus = OrderStatus.NEW;
        this.recipes = recipes;
        this.price = priceOfOrder();
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

    private Double priceOfOrder() throws Exception {
        Double price = 0d;
        List<String> listKeys = this.recipes.keySet().stream().toList();

        for (int i = 0; i < listKeys.size(); i++) {
            price += RecipeStorage.getById(listKeys.get(i)).getCost()
                    * recipes.get(listKeys.get(i));
        }
        return price;
    }
}
package order;

import java.util.HashMap;

public class OrderStorage {
    final private static HashMap<String, Order> orderMap = OrderGenerator.generateOrderMap();

    public static HashMap<String, Order> getData() {
        return orderMap;
    }

    public static Order getById(String id) throws Exception {
        Order order = orderMap.get(id);
        if (order == null) {
            throw new Exception("Order with id " + id + " not found.");
        }
        return order;
    }
}

package order;

import java.util.HashMap;
import java.util.Random;

public class OrderGenerator {
    private static final Random rnd = new Random();

    public static HashMap<String, Order> generateOrderMap() {
        HashMap<String, Order> orderMap = new HashMap<>();
        int countOfOrders = rnd.nextInt(5) + 2;
        for (int i = 0; i < countOfOrders; i++) {
            HashMap<String, Byte> mapOfResipes = new HashMap<>();
        }
        return orderMap;
    }
}

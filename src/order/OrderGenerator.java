package order;

import client.ClientStorage;
import recipe.RecipeStorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class OrderGenerator {
    private static final Random rnd = new Random();

    public static HashMap<String, Order> generateOrderMap() throws Exception {
        HashMap<String, Order> orderMap = new HashMap<>();                  //мапа заказов, которую будем заполнять и возвращать из метода
        int countOfOrders = rnd.nextInt(5) + 2;                      //рандомим количество заказов в мапе
        ArrayList<String> clientList = new ArrayList<>(ClientStorage.getData().keySet().stream().toList()); //список Id клиентов из ClientStorage
        for (int i = 0; i < countOfOrders; i++) {
            HashMap<String, Byte> mapOfRecipes = new HashMap<>();           //мапа рецептов (пицц) в заказе
            int countOfRecipes = rnd.nextInt(5) + 2;                 //количество разных рецептов в мапе рецептов
            ArrayList<String> listOfIdRecipes = new ArrayList<>(RecipeStorage.getData().keySet().stream().toList());    //список Id всех рецептов пиццерии
            for (int j = 0; j < countOfRecipes; j++) {
                int index = rnd.nextInt(listOfIdRecipes.size());            //рандомим индекс рецепта из списка рецептов
                mapOfRecipes.put(listOfIdRecipes.get(index), (byte) (rnd.nextInt(3) + 1));  //добавляем Id рецепта и генерируем количество пицц этого рецепта
                listOfIdRecipes.remove(index);                              //удаляем Id рецепта из списка рецептов, чтобы не было повторов
            }
            int index = rnd.nextInt(clientList.size());                     //рандомим индекс клиента из списка клиентов
            Order newOrder = new Order(clientList.get(index), mapOfRecipes);//создаем объект класса Order
            clientList.remove(index);                                       //удвляем Id клиента из спискаклиентов, чтобы не повторялся
            orderMap.put(newOrder.getId(), newOrder);                       //добавляем созданный заказ в мапу заказов
        }
        return orderMap;
    }
}

package recipe;

import ingredient.IngredientStorage;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Recipe {
    private String id;
    private String name;
    private Map<String, Integer> ingredientMap;//
    private Double cost;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getIngredientMap() {
        return ingredientMap;
    }

    public Double getCost() {
        return cost;
    }

    public Recipe(String nameRecipe, Map<String, Integer> ingredientMap) {
        this.id = UUID.randomUUID().toString();
        this.name = nameRecipe;
        this.ingredientMap = ingredientMap;
        this.cost = costOfpizza(this);
    }

    public Double costOfpizza(Recipe recipe) {

        List<String> listKeys = recipe.ingredientMap.keySet().stream().toList();
        Double sumOfCosts = 0.0;
        for (int i = 0; i < listKeys.size(); i++) {
            Double costOfIngredientOnStorage = IngredientStorage.getData().get(i).getPrice();//цена ингридиента на складе (за какой вес???)
            Double cosеOfIngredientInRecipe = ingredientMap.get(i) * costOfIngredientOnStorage;// = вес ингридиента * стоимость ингредиента на складе
            sumOfCosts = sumOfCosts + cosеOfIngredientInRecipe;
        }
        return sumOfCosts;
    }
}

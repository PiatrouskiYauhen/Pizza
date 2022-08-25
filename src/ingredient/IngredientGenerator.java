package ingredient;

import java.util.HashMap;
import java.util.Random;

public class IngredientGenerator {
    private static final String[] ingredientNames = {
            "Flour",
            "Yeasts",
            "Salt",
            "Tomato",
            "Caned Cucumber",
            "Caned Tomato",
            "Salami",
            "Beckon",
            "Onion",
            "Olive oil",
            "Cheese",
            "Pepper",
            "Champignons"
    };
    private static final Random rnd = new Random();

    static public Ingredient generate() {
        return new Ingredient(ingredientNames[rnd.nextInt(ingredientNames.length)], generateWeight(), generatePrice());
    }

    static public HashMap<String, Ingredient> generateList() {
        HashMap<String, Ingredient> ingredients = new HashMap<>();

        for (String ingredientName : ingredientNames) {
            Ingredient ingredient = new Ingredient(ingredientName, generateWeight(), generatePrice());

            ingredients.put(ingredient.getId(), ingredient);
        }

        return ingredients;
    }

    static private int generateWeight() {
        return rnd.nextInt(100) * 100 + 500;
    }

    static private double generatePrice() {
        return (int)((rnd.nextDouble(100) + 1) * 100) / 100d;
    }
}
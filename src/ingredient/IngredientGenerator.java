package ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class IngredientGenerator {
    private final static String[] ingredientNames = {
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
    private static Random rnd = new Random();

    static public Ingredient generate() {
        return new Ingredient(UUID.randomUUID().toString(),
                ingredientNames[rnd.nextInt(ingredientNames.length)],
                rnd.nextInt(100) + 5,
                rnd.nextInt(100) + 1);
    }

    static public ArrayList<Ingredient> generateList() {
        ArrayList<Ingredient> ingredientList = new ArrayList<>();

        for (String ingredientName : ingredientNames) {
            ingredientList.add(new Ingredient(ingredientName,
                    rnd.nextInt(100) * 100 + 500,
                    (int)((rnd.nextDouble(100) + 1) * 100) / 100d));
        }

        return ingredientList;
    }
}

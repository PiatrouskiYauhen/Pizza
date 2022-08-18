package ingredient;

import java.util.Random;
import java.util.UUID;

public class IngredientGenerator {
    private final static String[] IngredientNames = {
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

    public Ingredient generate() {
        return new Ingredient(UUID.randomUUID().toString(),
                IngredientNames[rnd.nextInt(IngredientNames.length)],
                rnd.nextInt(100) + 5,
                rnd.nextInt(100) + 1);
    }
}

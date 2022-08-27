
package ingredient;

import java.util.HashMap;

public class IngredientStorage {
    final private static HashMap<String, Ingredient> ingredientMap = IngredientGenerator.generateMap();

    public static HashMap<String, Ingredient> getData() {
        return ingredientMap;
    }

    public static Ingredient getById(String id) throws Exception {
        Ingredient ingredient = ingredientMap.get(id);

        if (ingredient == null) {
            throw new Exception("Ingredient with id " + id + " not found.");
        }

        return ingredient;
    }
}
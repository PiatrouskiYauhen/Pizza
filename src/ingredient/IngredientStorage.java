
package ingredient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

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
    public static String getIdByName(String name) throws Exception {
        Ingredient ingredient = ingredientMap.values().stream()
                .filter(ingr -> Objects.equals(ingr.getName(), name))
                .findAny()
                .orElse(null);

        if (ingredient != null) {
            return ingredient.getId();
        } else throw new Exception("Ingredient " + name + " not found.");

    }
}
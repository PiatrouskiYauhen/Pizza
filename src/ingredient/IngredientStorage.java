package ingredient;

import java.util.HashMap;

public class IngredientStorage {
    private HashMap<String, Ingredient> ingredientMap;

    public IngredientStorage() {
        this.ingredientMap = IngredientGenerator.generateMap();
    }

    public Ingredient getById(String id) throws Exception {
        Ingredient ingredient = this.ingredientMap.get(id);

        if (ingredient == null) {
            throw new Exception("Ingredient with id " + id + " not found.");
        }

        return ingredient;
    }
}
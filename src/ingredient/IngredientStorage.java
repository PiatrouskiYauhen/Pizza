package ingredient;

import java.util.HashMap;

public class IngredientStorage {
    private HashMap<String, Ingredient> ingredientList;

    public IngredientStorage() {
        this.ingredientList = IngredientGenerator.generateList();
    }

    public Ingredient getById(String id) throws Exception {
        Ingredient ingredient = this.ingredientList.get(id);

        if (ingredient == null) {
            throw new Exception("Ingredient with id " + id + " not found.");
        }

        return ingredient;
    }
}
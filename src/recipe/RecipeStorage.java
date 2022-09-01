package recipe;

import ingredient.Ingredient;
import ingredient.IngredientGenerator;

import java.util.HashMap;

public class RecipeStorage {
    final private static HashMap<String, Recipe> recipeMap;

    static {
        try {
            recipeMap = RecipeGenerator.generateRecipeMap();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static HashMap<String, Recipe> getData() {
        return recipeMap;
    }

    public static Recipe getById(String id) throws Exception {
        Recipe recipe = recipeMap.get(id);

        if (recipe == null) {
            throw new Exception("Ingredient with id " + id + " not found.");
        }

        return recipe;
    }
}

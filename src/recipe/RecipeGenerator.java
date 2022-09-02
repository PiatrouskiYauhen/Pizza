package recipe;

import ingredient.Ingredient;
import ingredient.IngredientStorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class RecipeGenerator {
    private final static String[] recipeNames = {
            "Margherita",
            "Marinara",
            "Quattro Stagioni",
            "Carbonara",
            "Frutti di Mare",
            "Quattro Formaggi",
            "Napoletana",
            "Crudo",
            "Emiliana",
            "Schiacciata",
            "Prosciutto",
            "Americana",
            "Braccio di Ferro"
    };
    private static Random rnd = new Random();

    static public HashMap<String, Recipe> generateRecipeMap() throws Exception {
        HashMap<String, Recipe> recipes = new HashMap<>();

        for (String recipeName : recipeNames) {
            Recipe recipe = new Recipe(recipeName, generateMapOfIngredients());
            recipes.put(recipe.getId(), recipe);
        }
        return recipes;
    }

    static private HashMap<String, Integer> generateMapOfIngredients() {
        HashMap<String, Integer> recipe = new HashMap<>();

        try {
            recipe.put(IngredientStorage.getIdByName("Flour"), 100);
            recipe.put(IngredientStorage.getIdByName("Yeasts"), 10);
            recipe.put(IngredientStorage.getIdByName("Salt"), 5);
        } catch (Exception ex) {

        }
        ArrayList<Ingredient> ingredientArrayList = new ArrayList<>(IngredientStorage.getData().values().stream().toList());
        ingredientArrayList.removeIf(ingredient -> ingredient.getName().equals("Flour"));
        ingredientArrayList.removeIf(ingredient -> ingredient.getName().equals("Yeasts"));
        ingredientArrayList.removeIf(ingredient -> ingredient.getName().equals("Salt"));
        int randomIngridientAmount = rnd.nextInt(ingredientArrayList.size() / 2) + 1;
        for (int i = 0; i < randomIngridientAmount; i++) {
            int randomIngridient = rnd.nextInt(ingredientArrayList.size());
            recipe.put(ingredientArrayList.get(randomIngridient).getId(), rnd.nextInt(150) + 50);
            ingredientArrayList.remove(randomIngridient);
        }
        return recipe;
    }
}

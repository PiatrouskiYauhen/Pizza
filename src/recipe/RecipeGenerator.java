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

    static public HashMap<String, Recipe> generateRecipeMap() {

        for (String recipeName:recipeNames) {



        }
        HashMap<String, Integer> recipes = new HashMap<>();

        try {
            recipes.put(IngredientStorage.getIdByName("Flour"), 100);
            recipes.put(IngredientStorage.getIdByName("Yeasts"), 10);
            recipes.put(IngredientStorage.getIdByName("Salt"), 5);
        } catch (Exception ex) {

        }
        ArrayList<Ingredient> ingredientArrayList = (ArrayList<Ingredient>) IngredientStorage.getData().values();
        ingredientArrayList.removeIf(ingredient -> ingredient.getName().equals("Flour"));
        ingredientArrayList.removeIf(ingredient -> ingredient.getName().equals("Yeasts"));
        ingredientArrayList.removeIf(ingredient -> ingredient.getName().equals("Salt"));
        int randomIngridientAmount = rnd.nextInt(ingredientArrayList.size() / 2) + 1;
        for (int i = 0; i < randomIngridientAmount; i++) {
            int randomIngridient = rnd.nextInt(ingredientArrayList.size());
            recipes.put(ingredientArrayList.get(randomIngridient).getId(), rnd.nextInt(150) + 50);
            ingredientArrayList.remove(randomIngridient);
        }
         return recipes;
    }
}

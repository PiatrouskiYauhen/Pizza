package ingredient;

import java.util.HashMap;

public class IngredientService {

    public static void addIngredient(Ingredient ingredient, int quantity, double price) throws Exception {
        validateNatural(quantity);
        HashMap<String, Ingredient> storage = IngredientStorage.getData();
        storage.compute(ingredient.getId(), (key, ingr) -> {
            Ingredient updated;
            if (ingr == null) {
                updated = ingredient;
                updated.setWeight(quantity);
            } else {
                updated = ingr;
                updated.setWeight(ingr.getWeight() + quantity);
            }
            updated.setPrice(price);
            return updated;
        });
    }

    public static void subtractIngredient(String ingredientId, int quantity) throws Exception {
        validateNatural(quantity);
        Ingredient ingredient = IngredientStorage.getById(ingredientId);
        int subtract = ingredient.getWeight() - quantity;
        if (subtract < 0) {
            throw new Exception("There is no such amount of " + ingredient.getName() + " in storage");
        }
        ingredient.setWeight(subtract);
    }

    public static void validateNatural(int quantity) throws Exception {
        if (quantity <= 0) {
            throw new Exception("Enter a natural number");
        }
    }

}

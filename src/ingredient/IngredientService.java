package ingredient;

import java.util.HashMap;

public class IngredientService {

    public static void addIngredient(Ingredient ingredient, int quantity, Measure measure, double price) throws Exception {
        validateNatural(quantity);
        int conversionQuantity = (int) Math.round(quantity / Ingredient.measure.ratioOfConversion(measure));
        HashMap<String, Ingredient> storage = IngredientStorage.getData();
        storage.compute(ingredient.getId(), (key, ingr) -> {
            Ingredient updated;
            if (ingr == null) {
                updated = ingredient;
                updated.setQuantity(conversionQuantity);
            } else {
                updated = ingr;
                updated.setQuantity(ingr.getQuantity() + conversionQuantity);
            }
            updated.setPrice(price);
            return updated;
        });
    }

    public static void subtractIngredient(String ingredientId, int quantity, Measure measure) throws Exception {
        validateNatural(quantity);
        int conversionQuantity = (int) Math.round(quantity / Ingredient.measure.ratioOfConversion(measure));
        Ingredient ingredient = IngredientStorage.getById(ingredientId);
        int subtract = ingredient.getQuantity() - conversionQuantity;
        if (subtract < 0) {
            throw new Exception("There is no such amount of " + ingredient.getName() + " in storage");
        }
        ingredient.setQuantity(subtract);
    }

    public static void validateNatural(int quantity) throws Exception {
        if (quantity <= 0) {
            throw new Exception("Enter a natural number");
        }
    }

}

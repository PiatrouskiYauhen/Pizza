package ingredient;

import java.util.HashMap;

public class IngredientService {

    public static void addNewIngredient(Ingredient ingredient, int weight, double price) {
        HashMap<String, Ingredient> storage = IngredientStorage.getData();
        storage.compute(ingredient.getId(), (key, ingr) -> {
            Ingredient updated;
            if (ingr == null) {
                updated = ingredient;
                updated.setWeight(weight);
            } else {
                updated = ingr;
                updated.setWeight(ingr.getWeight() + weight);
            }
            updated.setPrice(price);
            return updated;
        });
    }
}

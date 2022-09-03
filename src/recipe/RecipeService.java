package recipe;
import ingredient.IngredientStorage;
public class RecipeService {
    public static boolean recipeIsReadyValidation(Recipe recipe) {

        return recipe.getIngredientMap().entrySet().stream()
                .allMatch
                         (entry -> entry.getValue() < IngredientStorage.getData().get(entry.getKey()).getQuantity());
    }
}

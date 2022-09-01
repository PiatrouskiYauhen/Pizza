package recipe;

import java.util.HashMap;
import java.util.Map;

public class RecipeService {
    public void recipeIsReadyValidation(Recipe recipe){
        Map<String,Integer> ingredientsOfRecipe = recipe.getIngredientMap();
        ingredientsOfRecipe.entrySet().stream(entry -> {

        });


    }
}

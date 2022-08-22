package ingredient;

import java.util.ArrayList;
import java.util.List;

public class IngredientStorage {
    private ArrayList <Ingredient> ingredientList = new ArrayList<>();

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public IngredientStorage() {
        this.ingredientList = IngredientGenerator.generateList();
    }
}

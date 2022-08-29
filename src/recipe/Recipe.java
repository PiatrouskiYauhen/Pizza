package recipe;

import java.util.Map;
import java.util.UUID;

public class Recipe {
    private String id;
    private String name;
    private Map<String, Integer> ingredientMap;//
    private Integer cost;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Map<String, Integer> getIngredientMap() {
        return ingredientMap;
    }

    public Integer getCost() {
        return cost;
    }

    public Recipe(String nameRecipe, Map<String, Integer> ingredientMap) {
        this.id = UUID.randomUUID().toString();
        this.name = nameRecipe;
        this.ingredientMap = ingredientMap;
    }
}

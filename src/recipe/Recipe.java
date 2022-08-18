package recipe;

import java.util.Map;
import java.util.UUID;

public class Recipe {
    private String ID;
    private String nameRecipe;
    private Map<String, Integer> mapOfRecipe;

    public Recipe(String nameRecipe) {
        this.ID = UUID.randomUUID().toString();
        this.nameRecipe = nameRecipe;
        //здесь будет МАП <Наименование ингридиента, вес>, когда будет склад сов семи ингридиентами
    }
//здесь будет метод формирования стоимости рецепта





}

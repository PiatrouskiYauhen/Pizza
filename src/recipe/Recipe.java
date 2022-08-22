package recipe;

import java.util.Map;
import java.util.UUID;

public class Recipe {
    private String idRecipe;
    private String nameRecipe;
    private Map<String, Integer> mapOfRecipe;
    private Integer costOfRecipe;

    public String getIdRecipe() {return idRecipe;}
    public String getNameRecipe() {return nameRecipe;}
    public Map<String, Integer> getMapOfRecipe() {return mapOfRecipe;}
    public Integer getPriceOfRecipe() {return costOfRecipe;}

    public Recipe(String nameRecipe) {
        this.idRecipe = UUID.randomUUID().toString();
        this.nameRecipe = nameRecipe;

        //здесь будет МАП <Имя_ингридиента, вес>, когда будет склад со в семи ингридиентами
        //this.costOfRecipe = "метод формирования стоимости рецепта"
    }

    //здесь будет метод формирования стоимости рецепта, после того, как у нас появится МАП <Имя_ингридиента, вес>

}

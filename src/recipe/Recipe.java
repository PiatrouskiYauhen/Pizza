package recipe;

import java.util.Map;
import java.util.UUID;

public class Recipe {
    private String id;
    private String name;
    private Map<String, Integer> mapOfRecipe;
    private Integer cost;

    public String getId() {return id;}
    public String getName() {return name;}
    public Map<String, Integer> getMapOfRecipe() {return mapOfRecipe;}
    public Integer getCost() {return cost;}

    public Recipe(String nameRecipe) {
        this.id = UUID.randomUUID().toString();
        this.name = nameRecipe;

        //здесь будет МАП <Имя_ингридиента, вес>, когда будет склад со в семи ингридиентами
        //this.costOfRecipe = "метод формирования стоимости рецепта"
    }

    //здесь будет метод формирования стоимости рецепта, после того, как у нас появится МАП <Имя_ингридиента, вес>

}

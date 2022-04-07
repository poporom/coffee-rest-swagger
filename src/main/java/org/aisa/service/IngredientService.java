package org.aisa.service;

import org.aisa.model.Dto.IngredientRequest;
import org.aisa.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientService {
    private static Map<Ingredient, Integer> ingredients = new HashMap<>();

    static {
        ingredients.put(Ingredient.WATER, 5000);
        ingredients.put(Ingredient.MILK, 5000);
        ingredients.put(Ingredient.BEANS, 5000);
        ingredients.put(Ingredient.CUPS, 5000);
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    public void updateIngredient(IngredientRequest ingredientRequest) {
        Ingredient ingredient = Ingredient.valueOf(ingredientRequest.getName());
        Integer count = Integer.valueOf(ingredientRequest.getCount());
        ingredients.put(ingredient, count);
    }

    public void reduceIngredient(Ingredient ingredient, Integer count) {
        ingredients.put(ingredient, getCount(ingredient) - count);
    }

    private Integer getCount(Ingredient ingredient) {
        return ingredients.get(ingredient);
    }

}

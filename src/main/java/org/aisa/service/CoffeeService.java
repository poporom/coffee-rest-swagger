package org.aisa.service;

import org.aisa.model.Coffee;
import org.aisa.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CoffeeService {
    private static Long index = 3L;
    private static Map<Long, Coffee> menu = new HashMap<>();

    static {
        Coffee coffee;
        Map<Ingredient, Integer> ingredients;

        coffee = new Coffee();
        coffee.setName("espresso");
        ingredients = new HashMap<>();
        ingredients.put(Ingredient.WATER, 100);
        ingredients.put(Ingredient.MILK, 0);
        ingredients.put(Ingredient.BEANS, 16);
        ingredients.put(Ingredient.CUPS, 1);
        coffee.setIngredients(ingredients);
        coffee.setCost(100);
        menu.put(1L, coffee);

        coffee = new Coffee();
        coffee.setName("cappuccino");
        ingredients = new HashMap<>();
        ingredients.put(Ingredient.WATER, 200);
        ingredients.put(Ingredient.MILK, 50);
        ingredients.put(Ingredient.BEANS, 12);
        ingredients.put(Ingredient.CUPS, 1);
        coffee.setIngredients(ingredients);
        coffee.setCost(100);
        menu.put(2L, coffee);

        coffee = new Coffee();
        coffee.setName("latte");
        ingredients = new HashMap<>();
        ingredients.put(Ingredient.WATER, 300);
        ingredients.put(Ingredient.MILK, 150);
        ingredients.put(Ingredient.BEANS, 20);
        ingredients.put(Ingredient.CUPS, 1);
        coffee.setIngredients(ingredients);
        coffee.setCost(100);
        menu.put(3L, coffee);
    }

    public Map<Long, Coffee> getAllCoffee() {
        return menu;
    }

    public Coffee getCoffee(Long id) {
        return menu.get(id);
    }
}

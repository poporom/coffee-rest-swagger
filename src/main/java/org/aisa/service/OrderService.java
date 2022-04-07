package org.aisa.service;

import org.aisa.model.Coffee;
import org.aisa.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderService {
    private final CoffeeService coffeeService;
    private final IngredientService ingredientService;

    private static Long money = 0L;

    public OrderService(CoffeeService coffeeService, IngredientService ingredientService) {
        this.coffeeService = coffeeService;
        this.ingredientService = ingredientService;
    }

    public Long getMoney() {
        return money;
    }

    public void deleteMoney() {
        money = 0L;
    }

    public void buyCoffee(Long index) {
        Coffee coffee = coffeeService.getCoffee(index);
        for (Map.Entry<Ingredient, Integer> entry : coffee.getIngredients().entrySet()) {
            ingredientService.reduceIngredient(entry.getKey(), entry.getValue());
        }
        money += coffee.getCost();
    }
}

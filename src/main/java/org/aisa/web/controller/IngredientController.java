package org.aisa.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.aisa.model.Dto.IngredientRequest;
import org.aisa.model.Ingredient;
import org.aisa.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ingredients")
@Slf4j
public class IngredientController {
    private final IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("")
    public Map<Ingredient, Integer> getIngredients() {
        log.info("process=get-ingredients");
        return ingredientService.getIngredients();
    }

    @PutMapping("")
    public void updateIngredient(@RequestBody IngredientRequest ingredientRequest) {
        log.info("process=update-ingredient");
        ingredientService.updateIngredient(ingredientRequest);
    }

}

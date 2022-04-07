package org.aisa.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.aisa.model.Coffee;
import org.aisa.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/coffee")
@Slf4j
public class CoffeeController {

    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping("")
    public Map<Long, Coffee> getCoffee() {
        log.info("process=get-coffee");
        return coffeeService.getAllCoffee();
    }
}

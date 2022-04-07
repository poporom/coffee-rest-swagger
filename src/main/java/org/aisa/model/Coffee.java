package org.aisa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {
    private String name;
    private Map<Ingredient, Integer> ingredients;
    private Integer cost;
}

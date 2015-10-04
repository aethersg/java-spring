package com.jude.spring.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by judetan on 4/10/15.
 */
public class Jungle {
    private Map<String, String> foods = new HashMap<String, String>();

    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }

    private Map<String, Animal> animals = new HashMap<String, Animal>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry : foods.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        sb.append("\n");

        for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        return sb.toString();
    }
}

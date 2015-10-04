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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jungle)) return false;

        Jungle jungle = (Jungle) o;

        return !(foods != null ? !foods.equals(jungle.foods) : jungle.foods != null) && !(animals != null ? !animals.equals(jungle.animals) : jungle.animals != null);

    }

    @Override
    public int hashCode() {
        int result = foods != null ? foods.hashCode() : 0;
        result = 31 * result + (animals != null ? animals.hashCode() : 0);
        return result;
    }
}

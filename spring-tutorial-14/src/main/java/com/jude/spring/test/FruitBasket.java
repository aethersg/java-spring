package com.jude.spring.test;

import java.util.List;

/**
 * Created by judetan on 4/10/15.
 */
public class FruitBasket {
    private String name;
    private List<String> fruits;

    public FruitBasket(List<String> fruits, String name) {
        this.fruits = fruits;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name);
        sb.append(" contains: \n");

        for (String fruit : fruits) {
            sb.append(fruit);
            sb.append("\n");
        }
        return sb.toString();
    }
}

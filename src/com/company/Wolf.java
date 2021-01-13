package com.company;

import java.util.ArrayList;

public class Wolf implements WildAnimal{
    ArrayList<WildAnimal> wildAnimals = new ArrayList<WildAnimal>();

    public void add(WildAnimal wildAnimal) {
        wildAnimals.add(wildAnimal);
    }
}

package com.company;

import java.util.ArrayList;

/*public class WildanimalList <E extends WildAnimal> {
    ArrayList<WildAnimal> wildAnimals = new ArrayList<WildAnimal>();*/

public class WildanimalList <E extends WildAnimal> {
    ArrayList<E> wildAnimals = new ArrayList<E>();

    public void add(E wildAnimal) {
        wildAnimals.add(wildAnimal);
    }
}

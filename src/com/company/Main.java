package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flying> animals = new ArrayList<>();
        animals.add(new Bird("Potyi", true));
        animals.add(new Bird("Madarka", false));
        animals.add(new LadyBird("Baboca", true));
        animals.add(new LadyBird("Katicadi", false));
//        Bird bird1 = new Bird(e);
//        Bird bird2 = new Bird("Madarka", false);
//        LadyBird ladyBird1 = new LadyBird("Baboca", true);
//        LadyBird ladyBird2 = new LadyBird("Katicadi", false);
        for (Flying animal: animals) {
            animal.fly();

        }
        List<Feeding> animals2 = new ArrayList<>();
        animals2.add(new Bird("Potyi", true));
        animals2.add(new Bird("Madarka", false));
        animals2.add(new LadyBird("Baboca", true));
        animals2.add(new LadyBird("Katicadi", false));
        for (Feeding animal: animals2) {
            animal.feed();
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Flying> animalia = new ArrayList<Flying>();
        animalia.add(new Bird("Potyi", true));
        animalia.add(new Bird("Madarka", false));
        animalia.add(new Bird("Madarka2", false));
        animalia.add(new LadyBird("Baboca", true));
        animalia.add(new LadyBird("Baboca2", true));
        animalia.add(new LadyBird("Katicadi", false));

        UncleBen uncleBen = new UncleBen();
        //uncleBen.feedBirds(animalia);
        uncleBen.feedBirds2(animalia);

        Wolf wolf1 = new Wolf();
        WildanimalList<Wolf> wolfs = new WildanimalList<Wolf>();
            wolfs.add(wolf1);
        /*List<Flying> animals = new ArrayList<>();
        animals.add(new Bird("Potyi", true));
        animals.add(new Bird("Madarka", false));
        animals.add(new LadyBird("Baboca", true));
        animals.add(new LadyBird("Katicadi", false));*/
//        Bird bird1 = new Bird(e);
//        Bird bird2 = new Bird("Madarka", false);
//        LadyBird ladyBird1 = new LadyBird("Baboca", true);
//        LadyBird ladyBird2 = new LadyBird("Katicadi", false);
        /*for (Flying animal: animals) {
            animal.fly();

        }
        List<Feeding> animals2 = new ArrayList<>();
        animals2.add(new Bird("Potyi", true));
        animals2.add(new Bird("Madarka", false));
        animals2.add(new LadyBird("Baboca", true));
        animals2.add(new LadyBird("Katicadi", false));
        for (Feeding animal: animals2) {
            animal.feed();
        }*/
    }
}


//1.Create a list that contains 3 Birds and 3 LadyBirds.
//Create a class called UcleBen


//2.Create a method in UnlceBen called feedBirds(?). feedBird(?) calls feed() method of given object.
// Call it on a Bird object. Than on Dog object
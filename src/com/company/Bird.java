package com.company;

public class Bird implements Flying, Feeding, Speaking {
    protected String name;
    protected boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public void fly(){
        speak("Chip,chip");
    }

    @Override
    public void feed() {
        speak("What a wonderful worm");
    }
}


//Create a Bird class with a name, and isFemale field
//Create a LadyBird class with a name and isFemale field

//Create a Flying interface with a method void fly()
//Bird and LadyBird must implement Flying
//Create constructor for both Bird and LadyBird, where you can set up name and isFemale fields

//When Bird flies, it “says” Csájp, Csájp
//When LadyBird flies, it says “Buzz, Buzz”

//Implement feed() method in both classes.
//When LadyBird feeds it says: “I love aphid”
//When Bird feeds it says, “What a wonderful worm”

//When I say “says” call speak()

//Call fly() on 2 LadyBird and 2 Bird in Main with a method: fly()

//Call feed() on 2 LadyBird and 2 Bird in Main with a method: feed()


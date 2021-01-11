package com.company;

public class LadyBird implements Flying, Feeding, Speaking {
    protected String name;
    protected boolean isFemale;

    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }
    @Override
    public void fly(){
        speak("Buzz, buzz");
    }

    @Override
    public void feed() {
        speak("I love aphid");
    }
}

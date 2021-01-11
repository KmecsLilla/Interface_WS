package com.company;

public class LadyBird implements Flying, Feeding {
    protected String name;
    protected boolean isFemale;

    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }
    @Override
    public void fly(){
        System.out.println("Buzz, buzz");
    }

    @Override
    public void feed() {
        System.out.println("I love aphid");
    }
}

package com.example;

public class TestInheritance {
    public static void main(String[] args) {

        Classical classicalGuitar = new Classical();
        Electrical electricalGuitar = new Electrical();

        Bass bassGuitar = new Bass();


        // Calling Overriden functions/methods
        classicalGuitar.play();
        classicalGuitar.sound();

        electricalGuitar.play();
        electricalGuitar.sound();

        bassGuitar.play();
        bassGuitar.sound();
    }
}

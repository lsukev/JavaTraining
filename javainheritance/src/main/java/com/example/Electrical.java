package com.example;

/**
 * Created by lsuke on 8/22/2016.
 */
public class Electrical extends Guitar {

    public Electrical(){
        System.out.println("Hello from Electric Constructor");
    }

    //Override methods
    public void sound(){
        System.out.println("Electric sound is great!");
    }

    public void play(){
        System.out.println("grugggeeeeeeee!");

    }
}

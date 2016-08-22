package com.example;

/**
 * Created by lsuke on 8/22/2016.
 */
public class Bass extends Guitar{
    public Bass(){
        super();
        System.out.println("Bass Constructor");
    }

    public void sound(){
        System.out.println("Some loud bass mannnnn!");
    }
    public void play(){
        System.out.println("BooBoooooommmm!");
    }
}

package com.example;

/**
 * Created by lsuke on 8/22/2016.
 */

//Parent class
public class Guitar {
    private String name;
    private int serialNum;
    private int numbStrings;

    public Guitar(){
        System.out.println("Parent Constructor");
    }

    public void play(){
        System.out.println("titititititi");
    }

    public void sound(){
        System.out.println("Playing a sweet sound!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getNumbStrings() {
        return numbStrings;
    }

    public void setNumbStrings(int numbStrings) {
        this.numbStrings = numbStrings;
    }
}

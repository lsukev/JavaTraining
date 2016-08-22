package com.example;

public class javaArrays {
    public static void main(String[] args) {

        int[] myArray = {3, 5, 6}; // lenth of 3;
        String[] myStrings = {"Hey", "There", "I", "Love", "Android"};

        for (int i = 0; i <myArray.length; i++){
            System.out.println("Array values: " + myArray[i]);
        }
        for (int i =0; i < myStrings.length; i++){
            System.out.println("At index: " + i + myStrings[i]);
        }
    }
}

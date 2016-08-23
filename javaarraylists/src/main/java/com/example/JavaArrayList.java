package com.example;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("ArrayLists are great");
        myArrayList.add("Hello there");
        myArrayList.add("Great!");

        for (int i=0;i < myArrayList.size();i++){
//            System.out.println("Items: " + myArrayList.get(i));
        }

//        myArrayList.remove(0);
        myArrayList.remove("Great!");

        //enhanced for loop
        for (String item : myArrayList){
            System.out.println("My items: " +item);
        }


    }
}

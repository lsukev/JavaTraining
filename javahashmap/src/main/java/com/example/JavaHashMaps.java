package com.example;

import java.util.HashMap;

public class JavaHashMaps {

    public static void main(String[] args) {
        HashMap myHashMap = new HashMap();

        myHashMap.put(1, "Bonni");
        myHashMap.put(2, "Kevin");
        myHashMap.put(3, "Crystal");
        myHashMap.remove(2);

//        if (myHashMap.containsKey("sds")){
//            System.out.println("HALLELUHAH " + myHashMap.get(2) + " IS HERE");
//        }else{
//            System.out.println("Kev isn't here :(");
//        }

        System.out.println(" " + myHashMap.size());
    }


}

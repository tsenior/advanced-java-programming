package com.tinyiko;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList<String> characters = new LinkedList<>();


        characters.add("C");
        characters.add("Z");
        characters.add(1,"B");
        characters.addLast("D");
        characters.addFirst("A");

        System.out.println(characters);

        characters.remove("Z");
        System.out.println(characters);

        if (!characters.contains("Z") ) {
            System.out.println("Z doesnt exists");
        }

    //A queue is a first in first out data structure


    }
}

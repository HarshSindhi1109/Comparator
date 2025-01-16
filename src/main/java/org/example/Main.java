package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new CompareExample().compareExample();
        List names = new LinkedList<>();
        names.add(new CompareLinkedList("Luffy"));
        names.add(new CompareLinkedList("Zoro"));
        names.add(new CompareLinkedList("Sanji"));
        names.add(new CompareLinkedList("Chopper"));
        names.add(new CompareLinkedList("Whitebeard"));

        System.out.println(names);
        names.sort(null);
        System.out.println(names);

        List<Object> elements = new LinkedList<>();

        elements.add(new Name("Superman"));
        elements.add(new Name("Batman"));
        elements.add(new Name("Ironman"));
        elements.add(100);
        elements.add(3.14);

        System.out.println(elements);
    }
}
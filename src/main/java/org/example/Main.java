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
    }
}
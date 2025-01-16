package org.example;

class CompareLinkedList implements Comparable<CompareLinkedList> {
    private String name;

    public CompareLinkedList(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(CompareLinkedList obj) {
        if(name.length() == obj.name.length()) return 0;
        else if(name.length() > obj.name.length()) return 1;
        else return -1;
    }
}

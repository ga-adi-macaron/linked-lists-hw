package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(new Integer(10));
        myLinkedList.add(new Integer(20));
        myLinkedList.add(new Integer(30));
        myLinkedList.add(new Integer(40));
        myLinkedList.add(new Integer(50));

        System.out.println(myLinkedList.getSize());

        myLinkedList.reverseList();

        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.println("For Loop: " + myLinkedList.get(i));
        }
    }
}

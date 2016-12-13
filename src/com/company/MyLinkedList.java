package com.company;

/**
 * Created by student on 12/12/16.
 */
public class MyLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean remove(int index) {
        if (index > size) {
            return false;
        } else {
            Node<T> headNode = head;
            Node<T> nextNode;
            for (int i = 0; i < index; i++) {
                headNode = headNode.getNext();
            }
            nextNode = headNode.getNext();
            headNode.setNext(nextNode);
            size--;
            return true;
        }
    }

    public T get(int index) {
        if (index > size) {
            return null;
        } else {
            Node<T> headNode = head;
            for (int i = 0; i < index; i++) {
                headNode = headNode.getNext();
            }
            return (T) headNode.getData();
        }
    }

    public void add(T obj) {
        if (head == null) {
            head = new Node<T>(obj);
        } else {
            Node<T> headNode = head;
            Node<T> nextNode = headNode.getNext();
            while (nextNode != null) {
                headNode = headNode.getNext();
                nextNode = headNode.getNext();
            }
            headNode.setNext(new Node<>(obj));
        }
        size++;
    }

    public void reverseList() {
        Node<T> headNode = head;
        Node<T> lastNode = null;
        Node<T> currentNode = headNode;
        Node<T> nextNode;
        while (currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.next = lastNode;
            lastNode = currentNode;
            currentNode = nextNode;
        }
        headNode = lastNode;
        head = headNode;
    }
}

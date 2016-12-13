package com.company;

/**
 * Created by student on 12/12/16.
 */
public class Node<T> {
    Node<T> next;
    T data;

    public Node(T data) {
        this(data, null);
    }

    public Node(T data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

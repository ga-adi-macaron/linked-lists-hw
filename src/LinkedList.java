/**
 * Created by jay on 12/13/16.
 */

/*
Using a doubly-linked list.

Values used - 24, 7, 4, 10
 */

public class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {

            data = d;
            next = null;
        }
    }

    /* Method to reverse the linked list */
    Node reverse(Node node) {

        Node previous = null;
        Node current = node;
        Node next = null;

        while (current != null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        node = previous;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {

        while (node != null) {

            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.head = new Node(24);
        list.head.next = new Node(7);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(10);

        System.out.println("Given Linked list");
        list.printList(head);

        head = list.reverse(head);
        System.out.println("");

        System.out.println("Reverse Linked List");
        list.printList(head);
    }
}

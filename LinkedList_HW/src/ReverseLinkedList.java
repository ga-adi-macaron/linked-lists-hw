/**
 * Created by Serkan on 12/12/16.
 */
public class ReverseLinkedList {

    public static void main (String[] args) throws java.lang.Exception {
        LinkedListT a = new LinkedListT();
        a.addAtBegin(5);
        a.addAtBegin(10);
        a.addAtBegin(15);
        a.addAtBegin(20);
        a.addAtBegin(25);
        a.addAtBegin(30);
        a.display(a.head);
        a.reverseIterative(a.head);
    }
}

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListT {
    public Node head;
    public LinkedListT(){
        head=null;
    }

    public void addAtBegin(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void reverseIterative(Node head) {
        Node currNode = head;
        Node nextNode = null;
        Node prevNode = null;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        head = prevNode;
        System.out.println("\nReverse");
        display(head);

    }

    public void display(Node head){
        Node currNode = head;
        while(currNode!=null){
            System.out.print("-" + currNode.data);
            currNode=currNode.next;
        }
    }
}
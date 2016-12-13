import java.util.Iterator;

/**
 * Created by Scott Lindley on 12/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        populateList(myLinkedList);

        printList(myLinkedList);

        reverseList(myLinkedList);

        printList(myLinkedList);

    }

    public static void populateList(MyLinkedList<Integer> myLinkedList){
        for (int i=1; i<=25; i++){
            myLinkedList.add(i);
        }
    }

    public static void printList(MyLinkedList<Integer> myLinkedList){
        System.out.println("***********");

        Iterator<Integer> iterator = myLinkedList.iterator();
        System.out.println(myLinkedList.get(0));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("***********");
    }

    public static MyLinkedList<Integer> reverseList(MyLinkedList<Integer> myLinkedList) {
        if (myLinkedList.getSize() > 1) {
            Node<Integer> head = new Node<>(myLinkedList.get(0));
            myLinkedList.remove(0);
            myLinkedList = reverseList(myLinkedList);
            //Add the head to the end after the recursive call
            myLinkedList.add(head.getData());
            return myLinkedList;
        }
        return myLinkedList;
    }
}

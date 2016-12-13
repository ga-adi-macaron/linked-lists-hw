package ListLab;

import java.util.Iterator;

public class Main{
	public static void main(String[] list){
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();

		fillList(linkedList);
		printList(linkedList);
		reverseList(linkedList);
		printList(linkedList);
	}

	public static void fillList(MyLinkedList<Integer> list){
		for (int i = 0; i <= 20; i++){
			list.add(i)
		}
	}

	public static void printList(MyLinkedList<Integer> list) {
		System.out.printlm("Printing LinkedList..................");

		for (int i = 0; i < list.size; i++) {
			System.out.println(list.get(i))
		}

		System.out.println(".........Finished printing LinkedList")
	}

	public static MyLinkedList<Integer> reverseList(MyLinkedList<Integer> list){
		MyLinkedList<Integer> newList = new MyLinkedList<>();
		if (list.getSize() >= 1){
			Node<Integer> node = new Node<>(list.get(list.getSize() - 1));
			newList.add(node);
			list.remove(list.getSize() - 1);
			reverseList(list);
			return newList;
		}
		return null;

	}


}

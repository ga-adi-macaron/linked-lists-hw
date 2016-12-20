package ListLab;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		//to-do
		if (index > size) {
			return false;
		}
		Node<T>node = head;
		Node<T>afterNode;
		for (int i = 0; i < index-1; i++) {
			node = node.getNext();
		}
		afterNode = node.getNext();
		node.setNext(afterNode);
		return true;

	}

	public T get(int index) {
		//to-do
		Node<T> nodeAtIndex = head;
		for (int i = 0; i <index ; i++) {
			nodeAtIndex = nodeAtIndex.getNext();
		}
		return nodeAtIndex.getData();
	}

	public void add(T obj) {
		//to-do
		if (head == null) {
			head = new Node<>(obj);
		}
		Node<T> node = head;
		while (node.getNext()!=null) {
			node = node.getNext();
		}
		return node.getData();
	}

	public void reverse () {
		Node<T>node = head;
		Node<T>node2 = head;

        while(node.getNext() != null) {
			node = node.getNext();
		}

		head = node;
        
        while (node != head){
            while (node2.getNext().getNext() != null) {
                node2 = node2.getNext();
            }

            node.setNext(node2);
            node = node.getNext();
            node2 = head;
        }


    }

	//The methods below are bonus

	public void add(int index, T obj){
		//to-do
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do
		}

		@Override
		public T next() {
			//to-do
		}

		@Override
		public void remove() {
			// to-do

		}

	}
}

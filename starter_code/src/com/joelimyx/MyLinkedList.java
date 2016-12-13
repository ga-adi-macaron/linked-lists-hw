package com.joelimyx;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		//to-do
		if (index > size){
			return false;
		}
		Node<T> iterator = head;
		for (int i = 0; i < index; i++) {
			iterator = iterator.getNext();
		}

		Node<T> temp = iterator.getNext();
		iterator.setNext(temp);
		size--;
		return true;
	}

	public T get(int index) {
		//to-do
		Node<T> temp = head;
		for (int i = 0; i < size; i++) {
			if (i==index){
				return temp.getData();
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void add(T obj) {
		//to-do
		if (head == null) {
			head = new Node<>(obj);
		}else {
			Node<T> temp = head;
			while (temp.getNext()!=null){
				temp = temp.getNext();
			}
			temp.setNext(new Node<>(obj));
		}
		size++;
	}

	/*-------------------------------------
	NEW METHOD FOR REVERSING
	------------------------------------- */
	public void reverse(){
		head = reverseRecursive(getSize(),head);
	}
	public Node<T> reverseRecursive(int currentSize, Node<T> current){
		System.out.println(currentSize);
		if (currentSize==0){
			return current;
		}
		Node<T> temp = head.getNext();
		remove(0);
		currentSize--;
		Node<T> iteration= head.getNext();
		for (int i = 0; i < currentSize - 1; i++) {
			iteration = iteration.getNext();
		}
		head.setNext(iteration);
		iteration.setNext(temp);
		return reverseRecursive(currentSize,head);
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
			return true;
		}

		@Override
		public T next() {
			//to-do
			return null;
		}

		@Override
		public void remove() {
			// to-do

		}

	}
}

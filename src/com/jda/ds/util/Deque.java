package com.jda.ds.util;

public class Deque<T> {
	Node head;
	Node tail;
	class Node{
		T data;
		Node next, previous;
		Node(T d){data = d; next = null; previous = null;}
	}
	public void addFront(T d){
		Node new_node = new Node(d);
		new_node.next = head;
		head = new_node;
		if(this.size() == 1) 
			tail = head;
	}
	public void addRear(T d){
		Node new_node = new Node(d);
		new_node.previous = tail;
		tail = new_node;
		if(this.size() == 1)
			head = tail;
	}
	public T removeFront(){
		T value = head.data;
		head = head.next;
		return value;
	}
	public T removeRear(){
		T value = tail.data;
		tail = tail.previous;
		return value;
	}
	public boolean isEmpty(){
		if(head == null && tail == null)
			return true;
		return false;
	}
	public int size(){
		int count = 0;
		Node current = head;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
}

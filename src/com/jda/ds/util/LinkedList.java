package com.jda.ds.util;

public class LinkedList<T> {
	Node head;
	class Node{
		T data;
		Node next;
		Node(T d){ data = d; next = null;}
	}
	public void add(T d){
		Node new_node = new Node(d);
		new_node.next = head;
		head = new_node;
		//System.out.println(head.data);
	}
	public void remove(T d){
		Node current = head;
		while(current != null){
			if(current.data == d){
				if(current == head)
					head = current.next;
				if(current.next == null)
				current.data = current.next.data;
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
	}
	public boolean search(T d){
		Node current = head;
		while(current != null){
			if(current.data == d)
				return true;
			current = current.next;
		}
		return false;
	}
	public boolean isEmpty(){
		if(head == null)
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
	public void append(T d){
		this.add(d);
	}
	public int index(T d){
		int count = 0;
		Node current = head;
		while(current.data != d){
			count++;
			current = current.next;
		}
		return count;
	}
	public void insert(int pos, T item){
		Node current = head;
		Node new_node = new Node(item);
		while(pos-- > 0){
			if(pos == 2){
				Node temp = current.next;
				current.next = new_node;
				new_node.next = temp;
		}
			current = current.next;
		}
	}
	public T pop(){
		int len = this.size();
		Node current = head;
		T value = null;
		while(len-- >= 2){
			if(len == 2){
				 value = current.next.data;
				current.next = null;
			}
			current = current.next;
		}
		return value;
	}
	public T pop(int pos){
		Node current = head;
		System.out.println(head.next.data);
		T value = null;
		while(pos-- > 1){
			if(pos == 2){
				value = current.next.data;
				current.next = current.next.next;
			}
			current = current.next;
		}
		return value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		Node current = head;
		while(current != null){
			str += current.data + " ";
			current = current.next;
		}
	   return str;
	}
}

package com.ds;

public class DoublyLinkedList {
	Node2 first;
	Node2 last;
	
	public void insertFirst(int data){
		Node2 newNode = new Node2(data);
		if(isEmpty()){
			last = newNode;
		}else{
			Node2 firstOld = first;			
			newNode.next = firstOld;
			firstOld.previous = newNode;
		}
		first = newNode;
	}
	
	public void insertLast(int data){
		Node2 newNode = new Node2(data);
		if(isEmpty()){
			first = newNode;
		}else{
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}
	
	public void delete(int key){
		if(!isEmpty()){
			Node2 current = first;
			while(current != null){
	
				if(key == current.data){
					break;
				}
				if(current ==last){
					return;
				}
				current = current.next;
			}
			
			current.previous.next = current.next;
			current.next.previous=current.previous;
		}
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void print1(){
		Node2 current = first;
		while(current != null){
			System.out.print(current.data);
			current = current.next;
		}
		System.out.println();
	}

	public void print2(){
		Node2 current = last;
		while(current != null){
			System.out.print(current.data);
			current = current.previous;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(6);
		list.print1();
		list.print2();
		list.delete(1);
		list.print1();
	}

}


class Node2{
	Node2 previous;
	Node2 next;
	int data;
	public Node2(int data){
		this.data = data;
	}
}
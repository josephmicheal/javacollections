package com.ds;

public class SinglyLinkedList {
	
	SinglyLinkedListNode head;
	public boolean isEmpty(){
		return(head == null);
	}
	public void insertLast(int data){
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		if(head == null){
			head = newNode;
		}else{
			SinglyLinkedListNode current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void insertFirst(int data){
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		if(head == null){
			head = newNode;
		}else{
			SinglyLinkedListNode tmp = head;
			head = newNode;
			head.next = tmp;
		}
	}
	
	public void displayAll(){
		SinglyLinkedListNode tmp = head;
		while(tmp != null){
			System.out.println(tmp.getId());
			tmp = tmp.next;
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertLast(10);
		list.displayAll();
	}
}

class SinglyLinkedListNode {
	private int id;
	SinglyLinkedListNode next;

	public SinglyLinkedListNode(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
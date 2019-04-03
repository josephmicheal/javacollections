package com.ds;

public class CyclicLinkedList {
	
	CyclicLinkedListNode head;
	CyclicLinkedListNode last;
	public boolean isEmpty(){
		return(head == null);
	}
	public void insertLast(int data){
		CyclicLinkedListNode newNode = new CyclicLinkedListNode(data);
		if(isEmpty()){
			head = newNode;
			head.next=newNode;
		}else{
			CyclicLinkedListNode current = last;
			last.next = newNode;
			newNode.next=head;
		}
	}
	
	public void insertFirst(int data){
		CyclicLinkedListNode newNode = new CyclicLinkedListNode(data);
		if(isEmpty()){
			head = newNode;
		}else{
			CyclicLinkedListNode tmp = head;
			head = newNode;
			head.next = tmp;
			last.next=newNode;
		}
	}
	
	public void displayAll(){
		CyclicLinkedListNode tmp = head;
		while(tmp != last){
			System.out.println(tmp.getId());
			tmp = tmp.next;
		}
	}
	public static void main(String[] args) {
		CyclicLinkedList list = new CyclicLinkedList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		//list.insertLast(10);
		list.displayAll();
	}
}

class CyclicLinkedListNode {
	private int id;
	CyclicLinkedListNode next;

	public CyclicLinkedListNode(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
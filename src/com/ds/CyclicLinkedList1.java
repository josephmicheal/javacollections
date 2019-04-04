package com.ds;

public class CyclicLinkedList1 {

	Node1 first;
	Node1 last;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CyclicLinkedList1 list = new CyclicLinkedList1();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertLast(4);
		list.print();
		list.deleteFirst();
		list.print();
	}

	public void insertFirst(int data) {
		Node1 newNode = new Node1(data);

		if (isEmpty()) {
			last = newNode;
		} else {
			Node1 oldFirst = first;
			newNode.next = oldFirst;
		}
		first = newNode;
	}

	public void insertLast(int data) {
		Node1 newNode = new Node1(data);

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
		}
		last = newNode;
	}

	public void deleteFirst() {
		if (!isEmpty()) {
			if (first == last) {
				last = null;
			}
			first = first.next;
		}
	}


	public void print() {
		System.out.println("First to Last >>");
		Node1 current = first;
		while (current != null) {
			System.out.print(current.data + " > ");
			current = current.next;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return first == null;
	}
}

class Node1 {
	Node1 next;
	int data;

	public Node1(int data) {
		this.data = data;
	}
}



/*
First to Last >>
3 > 2 > 1 > 4 > 
First to Last >>
2 > 1 > 4 > 
*/
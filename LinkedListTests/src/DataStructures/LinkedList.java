package DataStructures;

public class LinkedList {
	private int size;
	private Node head;
	
	// initialize a linkedlist
	public LinkedList() {
		this.size = 0;
	}
	
	
	public void push(String value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = this.head;
		
		this.head = newNode;
		this.size++;
	}
	
	public String remove(int index) {
		Node current = this.head;
		Node temp;
		
		for(int i = 0; i < index-1; i++) {
			current = current.next;
		}
		
		temp = current.next;
		current.next = current.next.next;
		size--;
		
		return temp.value;		
	}
	
	
	public String get(int index) {
		Node current = this.head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}
	
	public int size() {
		return this.size;
	}
	
	private static class Node {
		public Node next;
		public String value;
		
		
	}
}

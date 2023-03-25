package com.hspedu.set_;

public class HashSetStructure {
	public static void main(String[] args) {
		Node[] table = new Node[16];
		System.out.println("table=" + table);

		Node john = new Node("john", null);
		table[2] = john;
		Node jack =new Node("Rose", null);
		john.next=jack;
		Node rose=new Node("rose", null);
		jack.next=rose;
		System.out.println("table=" + table);
		
		Node lucy=new Node("lucy", null);
		table[3]=lucy;
		System.out.println("table=" + table);
		
		
		

	}

}

class Node {
	Object item;
	Node next;

	public Node(Object item, Node next) {
		super();
		this.item = item;
		this.next = next;
	}



}

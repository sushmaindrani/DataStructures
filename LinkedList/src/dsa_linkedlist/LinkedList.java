package dsa_linkedlist;

public class LinkedList {

	Node head;
	
	public void add(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void addAtStart(int data)
	{
		Node n = new Node();
		n.data= data;
		n.next = head;
		head = n;
		//System.out.println(n.data);
		
	}
	public void addAtPosition(int index, int data)
	{
		Node n = new Node();
		n.data = data;
		n.next = null;
		
		Node hn = head;
		int i =0;
		if(index==0)
		{
			addAtStart(data);
		}
		else
		{
		while(i<index-1)
		{
			hn = hn.next;
			i++;
		}
		n.next = hn.next;
		hn.next = n;
		}
	}
	public void deleteAt(int index)
	{
		Node n = head;
		Node n1 =  null;
		int i=0;
		if(index==0)
		{
			head = n.next;
		}
		else
		{
		while(i<index-1)
		{
			n = n.next;
			i++;
		}
		n1 = n.next;
		n.next = n1.next;
		}
	}
	public void display()
	{
		Node n = head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}

package Stack_Imp_LinkedList;

public class Stack {

	Node top;
	int size=0;
	public void push(int data)
	{
		Node n = new Node();
		n.data = data;
		n.next = null;
		
		if(top==null)
		{
			top = n;
			size++;
		}
		else
		{
			n.next = top;
			top = n;
			size++;
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("No elements to pop");
		}
		else
		{
		Node n = top;
		top = n.next;
		size--;
		}
	}
	public int peek()
	{
		int data=0;
		if(isEmpty())
		{
			System.out.println("No elements in the stack");
		}
		else
		{
		data = top.data;
		}
		return data;
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void display()
	{
		Node n = top;
		if(isEmpty())
		{
			System.out.println("No elements in the stack");
		}
		else
		{
			System.out.println("Elements in the stack are-->");
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		}
	}
}

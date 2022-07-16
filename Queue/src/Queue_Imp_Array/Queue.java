package Queue_Imp_Array;

public class Queue {
	
	int[] queue_array;
	int front;
	int rear;
	int currentsize;
	int sizeOfArray;
	Queue(int sizeOfArray)
	{
		front = -1;
		rear = -1;
		currentsize = 0;
		this.sizeOfArray = sizeOfArray;
		queue_array = new int[sizeOfArray];
	}
	
	public void enqueue(int data) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue full");
		}
		else
		{
			rear++;
			if(rear >= sizeOfArray)
			{
				rear = 0;
			}
			queue_array[rear] = data;
			System.out.println(data +" added to the queue");
			currentsize++;
		}
	}
	public int dequeue() throws Exception
	{
		int removed_element = 0;
		if(isEmpty())
		{
			throw new Exception("Queue is empty");
		}
		else
		{
			if(front >= sizeOfArray)
			{
				front = -1;
			}
			removed_element = queue_array[front+1];
			System.out.println("deleted element from the queue is "+removed_element);
			front++;
			currentsize--;
		}
		return removed_element;
	}
	public boolean isEmpty()
	{
		return currentsize == 0;
	}
	public boolean isFull()
	{
		return currentsize == sizeOfArray;
	}
	public int size()
	{
		return currentsize;
	}
	public void display()
	{
		for(int i=1;i<=currentsize;i++)
		{
			System.out.print(queue_array[(front+i)%sizeOfArray]+ " ");
		} 
		System.out.println();
	}
}

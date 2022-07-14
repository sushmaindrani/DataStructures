package Stack_Imp_Array;

public class Stack {

	int[] stack_array;
	int top = 0;
	int capacity = 0;
	Stack(int array_size)
	{
		stack_array = new int[array_size];
		capacity = array_size;
	}
	public void push(int data)
	{
		if(top>=capacity)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
		stack_array[top] = data;
		System.out.println("Pushed "+data+" to the Stack");
		top++;
		}
		
	}
	public int pop()
	{
		int deleted_element = 0;
		if(top<=0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
		deleted_element = stack_array[top-1];
		stack_array[top-1] = 0;
		System.out.println("Popped "+deleted_element+" from the Stack");
		top--;		
		}
		return deleted_element;
	}
	public int peek()
	{
		return stack_array[top-1];
	}
	public int sizeOfStack()
	{
		return top;
	}
	public boolean isStackEmpty()
	{
		boolean flag;
		if(top<=0)
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
		return flag;
	}
	public void display()
	{
		System.out.println("All elements in the stack-->");
		for(int i=0;i<stack_array.length;i++) 
		{
			System.out.println(stack_array[i]);
		}
	}
}

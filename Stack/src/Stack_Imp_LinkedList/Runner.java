package Stack_Imp_LinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj = new Stack();
		obj.push(1);
		obj.push(3);
		obj.push(4);
		obj.display();
		obj.pop();
		obj.pop();
		obj.push(4);
		obj.display();
		System.out.println("Size of the stack "+obj.size());
		System.out.println("Peek of the stack is "+obj.peek());
		obj.pop();
		System.out.println(obj.isEmpty());
		obj.display();
		obj.pop();
		obj.display();
	}

}

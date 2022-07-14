package Stack_Imp_Array;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the size of the array-->");
			int array_size = in.nextInt();
			Stack obj = new Stack(array_size);
			
			System.out.println(obj.isStackEmpty());
			obj.push(13);
			System.out.println(obj.isStackEmpty());
			obj.push(14);
			int peek = obj.peek();
			System.out.println("peek element is-->"+peek);
			obj.push(15);
			obj.push(17);
			obj.pop();
			obj.pop();
			obj.push(1);
			obj.push(11);
			obj.push(111);
			obj.push(1111);
			obj.push(1111);
			int size1 = obj.sizeOfStack();
			System.out.println("Size of the stack is-->"+size1);
			obj.pop();
			obj.pop();
			obj.pop();
			obj.pop();
			obj.pop();
			obj.pop();
			int size2 = obj.sizeOfStack();
			System.out.println("Size of the stack is-->"+size2);
			System.out.println(obj.isStackEmpty());
			obj.display();
			in.close();
	}

}

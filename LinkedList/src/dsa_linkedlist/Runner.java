package dsa_linkedlist;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(101);
		list.add(1001);
		list.add(1003);
		list.deleteAt(0);
		list.addAtStart(30);
		list.addAtStart(300);
		list.addAtStart(40);
				
		//list.addAtPosition(0,911);
		list.deleteAt(1);
		list.display();
	}

}

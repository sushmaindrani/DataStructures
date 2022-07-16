package Queue_Imp_Array;

public class Runner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.enqueue(11);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.enqueue(16);
		
		q.display();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.display();
		
		q.enqueue(111);
		q.enqueue(155);
		q.enqueue(177);
		
		q.display();
		System.out.println("Number of elements present in the queue : "+q.size());
	}

}

public class JohnCircle {

	class Node {
		int num;
		Node next;

		public Node(int num) {
			this.num = num;
		}
	}

	Node tail;
	Node itr;
	int sum;

	public JohnCircle(int size) {
		sum = size;
		Node tmp = new Node(1);
		tmp.next = tmp;

		tail = tmp;
		itr = tmp;

		for (int i = 2; i <= size; i++) {
			insert(i);
		}

	}

	void insert(int num) {
		Node tmp = new Node(num);
		tmp.next = tail.next;
		tail.next = tmp;
		tail = tmp;
	}

	void deleteNext() {
		System.out.println(itr.next.num);
		itr.next = itr.next.next;
		this.sum--;
	}
	
	void moveOneStep(){
		itr = itr.next;
	}
	
	void play(){
		int limit = 4;
		int icr = 1;
		
		while (sum>0){

			if (icr%(limit -1)==0){
				this.deleteNext();
			}
			icr++;
			moveOneStep();
		}
		
		
	}

	public static void main(String[] args) {
		
		JohnCircle jc = new JohnCircle(5);
		jc.play();

	}

}

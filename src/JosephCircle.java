import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class JosephCircle {

	public static void main(String[] args) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {

		int limit =1;
		int size =6;
		Group gp = new Group(size);
		gp.play(limit);
		
		linklist ll = new linklist(size);
		ll.play(limit);
		

	}
}

class Group {
	int[] array;
	int curr = 0;
 
	int size;

	public Group(int num) {
		size = num;
		array = new int[num];
		for (int i = 0; i < num; i++)
			array[i] = i + 1;
	}

	public void delete() {
		System.out.println(array[curr]);
		array[curr] = 0;
		size--;
	}

	public void moveOneStep() {
		addCurr();
		while (array[curr] == 0)
			addCurr();
	}

	public void addCurr() {
		curr = (curr + 1) % array.length;
	}

	public void play(int upper) {
		int count = 1;
		while (size > 0) {
			count++;
			moveOneStep();
			if (count % upper == 0)
				delete();
		}

	}

}

class linklist {
	class Node {
		int num;
		Node next;
		 

		public Node(int num) {
			this.num = num;
		}
	}

	Node head;
	Node tail;
	Node hold;
	
	int sum;

	public linklist(int size) {
		sum = size;
		head = new Node(1);
		head.next = head;
		tail = head;
		hold = head;
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
	
	void moveToNext(){
		hold = hold.next;
	}
	void deleteNext(){
		System.out.println(hold.next.num);
		hold.next = hold.next.next;
		sum--;
	}
	
	void play(int limit){
		int icr = 1;
		
		if (limit == 1){
			for(int i=0;i<this.sum;i++){
				System.out.println(this.hold.num);
				this.moveToNext();
			}
			return;
		}
		 
		
		while (sum >0){
			if (icr%(limit -1 ) == 0)
				this.deleteNext();
			icr++;
			this.moveToNext();
			
		}
	}

}
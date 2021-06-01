package Queue;
import java.util.PriorityQueue;
public class Pqueue2 {
		public static void main(String[] args) {
			PriorityQueue p=new PriorityQueue();
			p.add(90);
			p.add(76);
			p.add(76);
			p.add(32);
			System.out.println("*****peek*****");
			System.out.println(p);
			System.out.println(p.peek());
			System.out.println(p);
			System.out.println(p.peek());
			System.out.println("****poll****");
			System.out.println(p);
			System.out.println(p.poll());
			System.out.println(p);
			System.out.println(p.poll());
			System.out.println(p.poll());
			System.out.println(p.poll());
			System.out.println(p.poll());
			
		}
}

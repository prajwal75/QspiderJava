package Linkedlist;
import java.util.LinkedList;
public class Linked1 {
		public static void main(String[] args) {
			LinkedList l1=new LinkedList();
			l1.add(6);
			l1.add(76);
			l1.add(56);
			l1.add(56);
			l1.add(23);
			System.out.println(l1.get(2));
			System.out.println(l1.peek());
			System.out.println(l1);
			System.out.println(l1.poll());
			System.out.println(l1);
		}
}

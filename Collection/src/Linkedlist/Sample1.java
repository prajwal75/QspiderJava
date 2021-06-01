package Linkedlist;
import java.util.LinkedList;
public class Sample1 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add('A');
		l1.add(10.45);
		l1.add("hllo");
		l1.add(true);
		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		
	}

}

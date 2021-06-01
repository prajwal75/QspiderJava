package Arraylist1;
import java.util.ArrayList;
public class Sample3 {
	public static void main(String[] args) {
		ArrayList l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		System.out.println(l2);
		ArrayList l3=new ArrayList();
		l3.add('A');
		l3.add('B');
		l3.add('C');
		System.out.println(l3);
		l2.addAll(l3);
		System.out.println(l2);
		
		
	}

}

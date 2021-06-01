package Arraylist1;

import java.util.ArrayList;
import java.util.Vector;

public class Sample10 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(23);
		v1.add(45);
		ArrayList l1=new ArrayList(v1);
		l1.add('a');
		l1.add('b');
		System.out.println("l1----->"+l1);
	}

}

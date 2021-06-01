
package Arraylist1;
import java.util.ArrayList;
import java.util.Collections;
public class Sample11 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(12);
		l1.add(95);
		l1.add(65);
		l1.add(34);
		l1.add(17);
		Collections.sort(l1);
		System.out.println(l1);
		
	}

}

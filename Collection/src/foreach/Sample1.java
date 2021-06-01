package foreach;

import java.util.LinkedList;

public class Sample1 {
		public static void main(String[] args) {
			LinkedList l1=new LinkedList();
			l1.add(10);
			l1.add('A');
			l1.add("hello");
			l1.add(true);
			l1.add(18.23);
			for(Object e : l1)
			{
				System.out.println(e);
			}
		}
}

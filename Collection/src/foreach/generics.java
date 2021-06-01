package foreach;
import java.util.ArrayList;
import java.util.Collections;
public class generics {
	public static void main(String[] args) {
		{
			ArrayList l1=new ArrayList();
			l1.add(10);
			l1.add(23);
			l1.add(36);
			l1.add(34);
			l1.add(54);
			l1.add(54);
			
			Collections.sort(l1);
			System.out.println(l1);
			
			for(Object o1: l1 ){
				System.out.println(o1);
			}
		}
	}

}

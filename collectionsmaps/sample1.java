package collectionsmaps;

import java.util.ArrayList;
class mobile
{
void call()
{
	System.out.println("miss call");
}
}
public class sample1 
{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.59);
		l1.add('A');
		l1.add("hello");
		l1.add(new mobile());
		mobile m1= (mobile)l1.get(4);
		m1.call();
		
	

	}

}

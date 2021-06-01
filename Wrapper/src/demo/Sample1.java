package demo;
import java.util.ArrayList;

class Mobile
{
	void call()
	{
		System.out.println("Miss call...");
	}
}


public class Sample1 {
	public static void main(String[] args){
		ArrayList l1=new ArrayList();
		l1.add(10);//0
		l1.add(40);//1
		l1.add(50);//2
		l1.add(20);//3
		l1.add(30);//4
		l1.add(new Mobile());  //5   Object o1=new Mobile();
		Mobile m1=(Mobile) l1.get(5);
		m1.call();
		
	}

}

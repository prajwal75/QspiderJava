package wrapperclass;

import java.util.ArrayList;

class Mobile
{
	void call(){
		System.out.println("miss call");
	}
}

public class Demo {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add("hello");
		l1.add('a');
		l1.add(new Mobile());
		Mobile m1=(Mobile) l1.get(4);
		m1.call();
		
	}

}

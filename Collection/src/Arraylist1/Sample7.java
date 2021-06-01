package Arraylist1;

import java.util.ArrayList;

public class Sample7 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("pune");
		l1.add("mysore");
		l1.add("mava");
		l1.add("goa");
		
		System.out.println("l1       "+l1);
		System.out.println(l1.remove(2));
		System.out.println("l1       "+l1);
		System.out.println(l1.remove("goa"));
		System.out.println("l1       "+l1);
		
		if(l1.contains("mysore"))
			{
				System.out.println("mysore is present");
			}
		else
			{
				System.out.println("mysore is not present");
			}
		
		}

}



package exceptiontopic;

public class Sample3 {

	public static void main(String[] args) {
		
		System.out.println("*****Main starts");
		Sample3 s1=null;
		try{
		System.out.println(s1.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("handled......");
		}
		System.out.println("****Main ends****");
	}
}

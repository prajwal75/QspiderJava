package exceptiontopic;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("******Main starts*******");
		
		try{
			int i=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled....");
		}
		System.out.println("******Main ends*******");
	}

}

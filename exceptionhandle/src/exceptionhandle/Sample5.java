package exceptionhandle;

public class Sample5 {
	public static void main(String[] args) {
		System.out.println("*****Main starts*****");
		try{
			int i=1/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught...");
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled...");
		}
		System.out.println("*****Main ends*****");
		
	}

}

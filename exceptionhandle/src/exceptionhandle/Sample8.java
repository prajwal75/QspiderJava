package exceptionhandle;

public class Sample8 {
	public static void main(String[] args) {
		System.out.println("*****Main starts*****");
		try{
			int i=1/0;
		   }
		catch(ArithmeticException e)
		{
			System.out.println("handled....");
		}
		finally{
			System.out.println("final statement");
		}
		System.out.println("*****Main ends*****");
	}

}

package exceptionhandle;

public class Sample4 {
	public static void main(String[] args) {
		System.out.println("*****Main starts*****");
		try{
			int i=1/0;
			System.out.println("hiiii");
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled.....");
		}
		System.out.println("*****Main ends*****");
	}

}

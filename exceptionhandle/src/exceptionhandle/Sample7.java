package exceptionhandle;

public class Sample7 {
	public static void main(String[] args) {
		System.out.println("*****Main starts*****");
		try{
			int i=1/0;
			int arr[]={1,2,3,4,5};
			try{
			System.out.println(arr[7]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("caught...");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled...");
			
		}
		System.out.println("*****Main ends*****");
	}

}

package exceptionhandle;

public class Sample2 {
	public static void main(String[] args) {
		System.out.println("*****Main starts*****");
		int[] arr={1,2,3,4,5};
		try{
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled...");
		}
		System.out.println("*****Main ends*****");
	}

}

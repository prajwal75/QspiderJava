package exceptionhandle;

public class Sample9 {
	public static void main(String[] args) {
		System.out.println("*****Main starts*****");
		try{
			 int i=1/0;
		}
		finally{
			System.out.println("final block");
		}
		System.out.println("*****Main starts*****");
		
	}

}

package exceptiontopic;

public class Sample {
	static void disp3()
	{
		int i=1/0;
	}
	static void disp2(){
		disp3();
	}
	static void disp1(){
		disp2();
	}
	public static void main(String[] args) {
		System.out.println("***Main ends*****");
		try{
			disp1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("******Main ends****");
	}
}

package samples;

class Test
{
	void hello()
	{
		System.out.println("hyyyyy");
	}
}

class Zero extends Test
{
	void hello()
	{
		System.out.println("byeeee");
	}
}

public class Sample1 {
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.hello();		//test
		Zero z=new Zero();
		z.hello();       //zero
		
		Test t1=new Zero();
		t1.hello();
		Zero z1=(Zero) t1;
		z1.hello();
		
		
	}

}

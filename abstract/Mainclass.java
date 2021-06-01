abstract class Sample3 
{
	abstract void test();
	abstract void disp();

}
class Demo extends Sample3
{
	void test()
	{
		System.out.println("test method");
	}
	void disp()
	{
		System.out.println("disp method");
	}
}
class Mainclass
{
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		d1.test();
		d1.disp();
	}

}
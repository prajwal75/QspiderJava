interface Demo
{
	void disp();
	void test();
}

class Demo1 implements Demo
{
	public void disp()
	{
		System.out.println("GM");
	}
	public void test()
	{
		System.out.println("GN");
	}

}
class Mainclass
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		d1.disp();
		d1.test();
	}
}
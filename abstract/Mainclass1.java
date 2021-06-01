abstract class Sample
{
	abstract void test();
	abstract void disp();
}
abstract class Demo extends Sample
{
	void test()
	{
		System.out.println("HI");
	}

}
class Tester extends Demo
{
	void disp()
	{
		System.out.println("Hello");
	}
}
class Mainclass1
{
	public static void main(String[] args)
	{
		Tester t1=new Tester();
		t1.test();
		t1.disp();
	}

}
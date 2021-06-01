class Sample
{
	int x=5;
}
class Test extends Sample
{
	void disp()
	{
		System.out.println("HEllo");
	}
}
class Demo extends Test
{
	int y=67;
}
class Multi
{
	public static void main(String [] args)
	{
		Demo d=new Demo();
		System.out.println(d.x);
		d.disp();
		System.out.println(d.y);
	}
}
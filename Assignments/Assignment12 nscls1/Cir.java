class Demo
{
	void area()
	{
		final double pi=3.142;
		int r=5;
		double c=pi*2*2;
		System.out.println(c);
	}
}
class Cir
{
	public static void  main(String[] args)
	{
		Demo x1=new Demo();
		x1.area();
	}
}
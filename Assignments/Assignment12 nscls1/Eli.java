class Demo
{
	void area()
	{	
		final double pi=3.142;
		int a=5;
		int b=6;
		double c=pi*a*b;
		System.out.println(c);
	}
}
class Eli
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area();
	}
}
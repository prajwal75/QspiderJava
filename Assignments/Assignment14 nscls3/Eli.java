class Demo
{
	double area()
	{
		final double pi=3.142;
		int a=5;
		int b=7;
		double c=pi*a*b;
		return c;
	}
}
class Eli
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		double x=x1.area();
		System.out.println(x);
	}
}
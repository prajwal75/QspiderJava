class Sample4
{
	static double area()
	{
		final double pi=3.142;
		int a=3;
		int b=5;
		double c=pi*a*b;
		return c;
	}
}
class Eli
{
	public static void main(String[] args)
	{
		double x=Sample4.area();
		System.out.println(x);
	}
}

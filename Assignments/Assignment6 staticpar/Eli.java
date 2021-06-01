class Sample4
{
	static void area(int a,int b)
	{
		final double pi=3.142;
		double c=pi*a*b;
		System.out.println(c);
	}
}
class Eli
{
	public static void main(String[] args)
	{
		Sample4.area(5,6);
	}
}
class Sample7
{
	static double area()
	{
		final double pi=3.142;
		int r=6;
		double c=pi*r*r;
		return c;
	}
}
class Cir
{
	public static void main(String[] args)
	{
		double x=Sample7.area();
		System.out.println(x);
	}
}

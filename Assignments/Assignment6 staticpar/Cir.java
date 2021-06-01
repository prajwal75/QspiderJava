class Sample7
{
	static void area(int r)
	{
		final double pi=3.142;
		double c=pi*r*r;
		System.out.println(c);
	}
}
class Cir
{
	public static void main(String[] args)
	{
		Sample7.area(5);
	}
}
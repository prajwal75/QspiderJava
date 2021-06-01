class Cir
{
	static double area()
	{
		int r=5;
		final double pi=3.142;
		double c=pi*r*r;
		return c;
	}
	public static void main(String[] args)
	{
		double x=area();
		System.out.println(x);
	}
}
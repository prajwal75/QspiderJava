class Cirpar
{
	static void area(int r)
	{
		final double pi=3.142;
		double c=pi*r*r;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		area(4);
		area(5);
		area(2);
	}
}
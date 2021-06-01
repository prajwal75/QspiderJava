class Cir
{
	void area()
	{
		final double pi=3.142;
		int r=5;
		double c=pi*r*r;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		new Cir().area();
	}
}
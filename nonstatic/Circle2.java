class Circle2
{
	void area(int r)
	{
		final double pi=3.142;
		double c=pi*r*r;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Circle2 x1 = new Circle2();
		x1.area(5);
	}
}
		
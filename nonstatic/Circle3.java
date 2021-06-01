class Circle3
{
	double area()
	{
		final double pi=3.142;
		int r=5;
		double c=pi*r*r;
		return c;
	}
	public static void main(String[] args)
	{
		Circle3 x1 = new Circle3();
		double x=x1.area();
		System.out.println(x);
	}
}
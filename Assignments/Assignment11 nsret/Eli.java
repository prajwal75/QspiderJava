class Eli
{
	double area()
	{
		final double pi=3.142;
		int a=5;
		int b=8;
		double c=pi*a*b;
		return c;
	}
	public static void main(String[] args)
	{
		Eli x1=new Eli();
		double x=x1.area();
		System.out.println(x);
	}

}
class Cir
{
	double area()
	{
		final double pi=3.142;
		int r=6;
		double c=pi*r*r;
		return c;
	}
	public static void main(String[] args)
	{
		Cir x1=new Cir();
		double x=x1.area();
		System.out.println(x);
	}
}
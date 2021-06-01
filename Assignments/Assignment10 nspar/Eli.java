class Eli
{
	void area(int a,int b)
	{
		final double pi=3.142;
		double c=pi*a*b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Eli x1=new Eli();
		x1.area(5,7);
	}
}
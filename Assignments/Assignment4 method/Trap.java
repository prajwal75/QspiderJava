class Trap
{	
	static double area()
	{
		int a=19;
		int b=25;
		int h=7;
		double c=0.5*(a+b)*h;
		return c;
	}
	public static void main(String[] args)
	{
		double x=area();
		System.out.println(x);
	}
}
class Trap
{
	double area()
	{
		int a=5;
		int b=7;
		int h=2;
		double c=0.5*(a+b)*h;
		return c;
	}
	public static void main(String[] args)
	{
		Trap x1=new Trap();
		double x=x1.area();
		System.out.println(x);
	}
}
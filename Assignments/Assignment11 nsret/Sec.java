class Sec
{
	double area()
	{
		int r=5;
		int t=65;
		double c=0.5*r*r*t;
		return c;
	}
	public static void main(String[] args)
	{
		Sec x1=new Sec();
		double x=x1.area();
		System.out.println(x);
	}
}
class Sample3
{
	static double area()
	{
		int a=3;
		int b=5;
		double c=a*b;
		return c;
	}
}
class Par
{
	public static void main(String[] args)
	{
		double x=Sample3.area();
		System.out.println(x);
	}
}

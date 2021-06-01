class Sample2
{
	static double area()
	{
		int a=6;
		int b=9;
		int h=4;
		double c=0.5*(a+b)*h;
		return c;
	}
}
class Trap
{
	public static void main(String[] args)
	{
		double x=Sample2.area();
		System.out.println(x);
	}
}

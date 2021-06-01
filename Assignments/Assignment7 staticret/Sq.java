class Sample6
{
	static double area()
	{
		int a=3;
		double c=a*a;
		return c;
	}
}
class Sq
{
	public static void main(String[] args)
	{
		double x=Sample6.area();
		System.out.println(x);
	}
}

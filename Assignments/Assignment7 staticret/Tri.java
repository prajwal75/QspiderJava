class Sample1
{
	static double area()
	{
		int b=5;
		int h=4;
		double c=0.5*b*h;
		return c;
	}
}
class Tri
{
	public static void main(String[] args)
	{
		double x=Sample1.area();
		System.out.println(x);
	}
}

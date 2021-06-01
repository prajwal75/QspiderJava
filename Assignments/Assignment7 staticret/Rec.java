class Sample5
{
	static double area()
	{
		int a=5;
		int b=7;
		double c=a*b;
		return c;
	}
}
class Rec
{
	public static void main(String[] args)
	{
		double x=Sample5.area();
		System.out.println(x);
	}
}

class Sample8
{
	static double area()
	{
		int r=6;
		int t=45;
		double c=0.5*r*r*t;
		return c;
	}
}
class Sec
{
	public static void main(String[] args)
	{
		double x=Sample8.area();
		System.out.println(x);
	}
}

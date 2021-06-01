class Sample8
{
	static void area(int r,int t)
	{
		double c=0.5*r*r*t;
		System.out.println(c);
	}
}
class Sec
{
	public static void main(String[] args)
	{
		Sample8.area(5,35);
	}
}
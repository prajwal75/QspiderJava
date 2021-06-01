class Sample2
{
	static void area(int a,int b,int h)
	{
		double c=0.5*(a+b)*h;
		System.out.println(c);
	}
}
class Trap
{
	public static void main(String[] args)
	{
		Sample2.area(5,9,5);
	}
}
		
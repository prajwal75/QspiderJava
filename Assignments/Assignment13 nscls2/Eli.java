class Demo
{
	void area(int a,int b)
	{
		final double pi=3.142;
		double c=pi*a*b;
		System.out.println(c);
	}
}
class Eli
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area(5,6);
	}
}
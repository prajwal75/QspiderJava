class Demo
{
	void area(int r)
	{
		final double pi=3.142;
		double c=pi*r*r;
		System.out.println(c);
	}
}
class Cir
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area(5);
	}
}
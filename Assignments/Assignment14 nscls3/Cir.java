class Demo
{
	double area()
	{
		final double pi=3.142;
		int r=6;
		double c=pi*r*r;
		return c;
	}
}
class Cir
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		double x=x1.area();
		System.out.println(x);
	}

}
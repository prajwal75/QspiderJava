class Demo
{
	double area()
	{
		int r=5;
		int t=65;
		double c=0.5*r*r*t;
		return c;
	}
}
class Sec
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		double x=x1.area();
		System.out.println(x);
	}
}
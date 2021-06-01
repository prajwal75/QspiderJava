class Demo
{
	void area(int r,int t)
	{
		double c=0.5*r*r*t;
		System.out.println(c);
	}
}
class Sec
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area(5,45);
	}
}
class Demo
{
	void area(int b,int h)
	{
		double c=0.5*b*h;
		System.out.println(c);
	}
}
class Tri
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area(5,6);
	}
}
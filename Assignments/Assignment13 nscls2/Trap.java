class Demo 
{
	void area(int a,int b,int h)
	{
		double c=0.5*(a+b)*h;
		System.out.println(c);
	}
}
class Trap
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area(5,6,8);
	}
}
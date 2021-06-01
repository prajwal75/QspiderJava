class Demo
{
	int area()
	{
		int a=5;
		int b=6;
		int c=a*b;
		return c;
	}
}
class Par
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		int x=x1.area();
		System.out.println(x);
	}
}
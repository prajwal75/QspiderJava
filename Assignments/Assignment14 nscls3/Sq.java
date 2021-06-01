class Demo
{
	int area()
	{
		int a=5;
		int c=a*a;
		return c;
	}
}
class Sq
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		int x=x1.area();
		System.out.println(x);
	}
}

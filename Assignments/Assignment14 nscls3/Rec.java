class Demo
{
	int area()
	{
		int a=6;
		int b=5;
		int c=a*b;
		return c;
	}

}
class Rec
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		double x=x1.area();
		System.out.println(x);
	}
}
class Demo
{
	void area()
	{
		int a=5;
		int b=8;
		int h=4;
		double c=0.5*(a+b)*h;
		System.out.println(c);
	}
	}
	class Trap
	{
		public static void main(String[] args)
		{
			Demo x1=new Demo();
			x1.area();
		}
	}
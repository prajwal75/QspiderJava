class Trap
{
	void area(int a,int b,int h)
	{
		double c=0.5*(a+b)*h;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
	Trap x1=new Trap();
	x1.area(5,8,3);
	}
	}
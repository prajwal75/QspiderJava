class Trap
{
	void area()
	{
		int a=5;
		int b=8;
		int h=5;
		double c=0.5*(a+b)*h;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Trap x1=new Trap();
		x1.area();
	}
}
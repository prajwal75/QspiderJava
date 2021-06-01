class Par
{
	int area()
	{
		int a=6;
		int b=5;
		int c=a*b;
		return c;
	}
	public static void main(String[] args)
	{
		Par x1=new Par();
		double x=x1.area();
		System.out.println(x);
	}
}
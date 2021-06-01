class Trapar
{
	static void area(int a,int b,int h)
	{
		double c=0.5*(a+b)*h;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		area(3,5,6);
		area(3,6,2);
		area(9,3,6);
	}
}
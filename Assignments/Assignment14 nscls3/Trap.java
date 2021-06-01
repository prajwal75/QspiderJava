class S
{
	double area()
	{
		int a=5;
		int b=8;
		int h=3;
		double c=0.5*(a+b)*h;
		return c;
	}
}
class Trap
{
	public static void main(String[] args)
	{
		S x1=new S();
		double x=x1.area();
			System.out.println(x);
	}
	}
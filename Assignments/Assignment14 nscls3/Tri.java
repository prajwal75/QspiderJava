class Demo
{
	double area()
	{
		int a=7;
		int b=4;
		double c=0.5*a*b;
		return c;
	}
}
class Tri
{
public static void main(String[] args)
{
	Demo x1=new Demo();
	double x=x1.area();
	System.out.println(x);
	}
	}
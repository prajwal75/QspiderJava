class Tri
{
	double area()
	{
	int a=5;
	int b=6;
	double c=a*b;
	return c;
	}
	public static void main(String[] args)
	{
		Tri x1=new Tri();
		double x=x1.area();
		System.out.println(x);
	}
	}
class Rec
{
	int area()
	{
		int a=5;
		 int  b=6;
		 int c=a*b;
		 return c;
	}
	public static void main(String[] args)
	{
		Rec x1=new Rec();
		int x=x1.area();
		System.out.println(x);
	}
}
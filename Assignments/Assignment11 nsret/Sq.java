class Sq
{
	int area()
	{
		int a=7;
		int c=a*a;
		return c;
	}
	public static void main(String[] args)
	{
		Sq x1=new Sq();
		int x=x1.area();
		System.out.println(x);
	}
}
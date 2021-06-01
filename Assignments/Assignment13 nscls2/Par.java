class Demo
{
	void area(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}

}
class Par
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area(5,6);
	}
}

class Sample3
{
	int a;
	String b;
	Sample3(int c,String d)
	{
		a=c;
		b=d;
	}
	public static void main(String[] args)
	{
		Sample3 s1=new Sample3(10,"hy");
		System.out.println(s1.a);
		System.out.println(s1.b);
	}

}
class Sample4
{
	int sid;
	String sname;
	char sgrade;
	Sample4(int a,String b,char c)
	{
		sid=a;
		sname=b;
		sgrade=c;
	}
	public static void main(String[] args)
	{
		Sample4 s1=new Sample4(120,"KIT",'A');
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.sgrade);
	}

}
class Emp
{
	String id;
	int sal;
	char grd;

	Emp(String a,int b,char c)
	{
		id =a;
		sal=b;
		grd=c;
	}
	public static void main(String[] args)
	{
		Emp x=new Emp("JHGSH513",50000,'A');
		System.out.println(x.id);
		System.out.println(x.sal);
		System.out.println(x.grd);
	}

}
class School
{
	String name;
	char grd;
	int strn;

	School(String a,char b,int c)
	{
		name=a;
		grd=b;
		strn=c;
	}

	public static void main(String[] args)
	{
		School x=new School("KVG",'A',340);
		System.out.println(x.name);
		System.out.println(x.grd);
		System.out.println(x.strn);
	
	}
}
class School
{
	 static String sch="St.marthas high school";
	String branch;
	char grd;
	int str;
	public static void main(String[] args)
	{
		School x=new School();
		x.branch="Mudigere";
		x.grd='A';
		x.str=500;
		System.out.println(sch);
		System.out.println(x.branch);
		System.out.println(x.grd);
		System.out.println(x.str);

	}
}
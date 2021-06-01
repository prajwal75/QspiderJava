class Course
{
	String cou;
	static String univ="VTU";
	static int cost=72000;
	public static void main(String[] args)
	{
		Course x=new Course();
		x.cou="EC";
		System.out.println(univ);
		System.out.println(cost);
		System.out.println(x.cou);
	}
}
class Course
{

	String name;
	String uni;
	int excost;

	Course(String a,String b,int c)
	{
		name=a;
		uni=b;
		excost=c;
	
	}

	public static void main(String[] args)
	{
		Course x=new Course("BE","VTU",55000);
		System.out.println(x.name);
		System.out.println(x.uni);
		System.out.println(x.excost);

	
	
	}
}
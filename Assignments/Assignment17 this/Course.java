class Course
{

	String name;
	String uni;
	int ecost;

	Course(String name,String uni,int ecost)
	{
		this.name=name;
		this.uni=uni;
		this.ecost=ecost;
	}

	public static void main(String[] args)
	{
		Course x=new Course("BE","VTU",55000);
		System.out.println(x.name);
		System.out.println(x.uni);
		System.out.println(x.ecost);
	}
}
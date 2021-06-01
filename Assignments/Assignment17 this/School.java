class School
{
	String name;
	char grade;
	int strn;

	School(String name,char grade,int strn)
	{
	this.name=name;
	this.grade=grade;
	this.strn=strn;
	}

	public static void main(String[] args)
	{
		School x=new School("KVG",'A',545);
		System.out.println(x.name);
		System.out.println(x.grade);
		System.out.println(x.strn);
	}
}
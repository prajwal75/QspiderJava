class IBM
{
	static int acc()
	{	
		int mnth_sal=10000;
		int no_mnth=12;
		int sal=mnth_sal*no_mnth;
		return sal;
	}
	public static void main(String[] args)
	{
		int x=acc();
		int bonus=20000;
		int total=x+bonus;
		System.out.println(total);
	}
}
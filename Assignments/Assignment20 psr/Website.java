class Result1
{
	void res()
	{
		System.out.println("Pass");
	}
}

class Website
{
	public static void main(String[] args)
	{
		Result1 r=new Result1();
		std1.getres(r);
		std2.getres(r);
	}
}

class std1
{
	static void getres(Result1 a)
	{
		a.res();
	}
}

class std2
{
	static void getres(Result1 a)
	{
		a.res();
	}
}
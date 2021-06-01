class  Factorial
{
	static void facto(int x)
	{
		int fact=1;
		for(int i=x;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args)
	{
		
		facto(5);
		facto(3);
		facto(6);
	}

}
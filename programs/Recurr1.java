class Recurr1
{
	static void disp(int i)
	{
		if(i>=1)
		{
			System.out.println(i);
			i--;
			disp(i);
		}
	}
	public static void main(String[]args)
	{
		disp(10);
	}
}
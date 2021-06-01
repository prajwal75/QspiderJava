class Recurr
{
	static void disp(int i)
	{
		if(i<=10)
		{
				System.out.println(i);
				i++;
				disp(i);
		}
	}
		public static void main(String[] args)
		{
			disp(1);
		}

}
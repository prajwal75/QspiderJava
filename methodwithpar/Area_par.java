class  Area_par
{
	static void area(int r)
	{
		final double pi=3.142;
		double d=pi*r*r;
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		area(5);
		area(9);
	}
}

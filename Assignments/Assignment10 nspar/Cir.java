class Cir
{
	void area(int r)
	{
		final double pi=3.142;
		double c=pi*r*r;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Cir x1=new Cir();
		x1.area(5);
	}

}
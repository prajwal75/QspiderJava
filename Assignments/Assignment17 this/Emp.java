class Emp
{
	String id;
	char a;
	int cost;

	Emp(String id,char a,int cost)
	{
		this.id=id;
		this.a=a;
		this.cost=cost;
	}

	public static void main(String[] args)
	{
		Emp x=new Emp("HJJH45",'A',45000);
		System.out.println(x.id);
		System.out.println(x.a);
		System.out.println(x.cost);

	}
}
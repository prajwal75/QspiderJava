class Mobile
{
	String name;
	String model;
	int cost;
	
	Mobile(String a,String b,int c)
	{
		name=a;
		model=b;
		cost=c;
	}
	
	public static void main(String[] args)
	{
		Mobile x=new Mobile("Samsung","Galaxy y",55000);
		System.out.println(x.name);
		System.out.println(x.model);
		System.out.println(x.cost);
	}

}
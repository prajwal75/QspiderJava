class Tv
{
	String name;
	String model;
	int cost;
	 Tv(String a,String b,int c)
	{
	 name=a;
	 model =b;
	 cost=c;
	 
	 }
	 public static void main(String[] args)

	{

		Tv x=new Tv("Samsung","OLED",200000);
		System.out.println(x.name);
		System.out.println(x.model);
		System.out.println(x.cost);
	}
}
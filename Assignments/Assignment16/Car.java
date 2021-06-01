class Car
{
	String name;
	String model;
	String type;
	int cost;
	Car(String a,String b,String c,int d)
	{
		name=a;
		model=b;
		type=c;
		cost=d;
	
	}
	public static void main(String[] args)
	{
		Car x=new Car("Tata","Altroz","Petrol",500000);
		System.out.println(x.name);
		System.out.println(x.model);
		System.out.println(x.type);
		System.out.println(x.cost);

	}
}
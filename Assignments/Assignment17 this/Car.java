class Car
{
	String model;
	String type;
	int cost;

	Car(String model,String type,int cost)
	{
	this.model=model;
	this.type=type;
	this.cost=cost;
	}

	public static void main(String[] args)
	{
		Car x=new Car("Altroz","petrol",500000);
		System.out.println(x.model);
		System.out.println(x.type);
		System.out.println(x.cost);
	}
}
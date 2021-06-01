class Car
{
	static String car="Tata";
	int cost;
	String type;
	String model;
		public static void main(String[] args)
		{
			Car x1=new Car();
			x1.cost=500000;
			x1.model="Altroz";
			x1.type="Petrol";
			System.out.println(car);
			System.out.println(x1.model);
			System.out.println(x1.cost);
			System.out.println(x1.type);
		}
}
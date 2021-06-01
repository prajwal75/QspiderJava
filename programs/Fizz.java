class Fizz
{
	static void buzz(int x)
	{
	if((x%5==0)&&(x%3==0))
	{
		System.out.println("BuzzBuzz");
	}
	else if(x%5==0)
	{
		System.out.println("FizzBuzz");
	}
	else if(x%3==0)
	{
		System.out.println("BuzzFizz");
	}
	}
	public static void main(String[] args)
	{
		buzz(15);
		buzz(10);
		buzz(9);
	}
}
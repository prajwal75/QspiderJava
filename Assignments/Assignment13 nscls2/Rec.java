class Demo
{
	void area(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}

}
class Rec 
{
	public static void main(String[] args)
	{
		Demo x1=new Demo();
		x1.area(3,6);
	}
}
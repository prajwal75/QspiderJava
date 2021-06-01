package Thread;


class Sample4 extends Object
{
	Sample4()
	{
		super();
		System.out.println("hi");
	}
}
class Demo extends Sample4
{
	Demo(double d){
		super();
		System.out.println("helllo");
	}
}
class Tester extends Demo
{
	Tester(int a)
	{
		super(5.6);
		//super("cool");
	}
}

public class Mainclasssuper {
		public static void main(String[] args) {
			new Tester(20);
			System.out.println("ho");
			
			
		}
}

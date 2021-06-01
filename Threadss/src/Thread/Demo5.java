package Thread;

class Demo8{
	Demo8()
	{
		System.out.println("hello");
	}
}
class Sample5 extends Demo8{
	
}
class Tester5 extends Sample5{
	Tester5(){
		System.out.println("hi");
	}
}

public class Demo5 {
	public static void main(String[] args) {
		new Tester5();
	}
}

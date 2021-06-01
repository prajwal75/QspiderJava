package Thread;

interface Sample23{
	void add();
	
}
interface Tester1{
	int a=10;
	
}
public class Sample22 implements Tester1,Sample23 {
	public void add()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Sample22 s2=new Sample22();
		s2.add();
		System.out.println(s2.a);
	}

}

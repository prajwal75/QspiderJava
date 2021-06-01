package Encap;

class Sample1
{
	private int a=27366;
	private String b="@yahoo.com";
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
}
public class Yahoo {
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		System.out.println(s.getA());
		System.out.println(s.getB());
		s.setA(354424);
		s.setB("@yahooo.in");
		System.out.println(s.getA());
		System.out.println(s.getB());
	}

}

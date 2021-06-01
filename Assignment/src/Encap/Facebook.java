package Encap;

class Sample
{
	private int p=56465;
	private String s="Helllooooo";
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
}
public class Facebook {
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.getP());
		System.out.println(s.getS());
		s.setP(654665);
		s.setS("Byeeeeeeeee");
		System.out.println(s.getP());
		System.out.println(s.getS());
	}

}

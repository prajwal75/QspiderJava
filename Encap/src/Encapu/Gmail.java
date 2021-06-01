package Encapu;

class Sample1 {
	private String pass="HELLO";

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}

public class Gmail{
		public static void main(String[] args)
		{
			Sample1 s1=new Sample1();
			System.out.println(s1.getPass());
			s1.setPass("hyyy");
			System.out.println(s1.getPass());
		}
}

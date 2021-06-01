package exceptionhandle;

public class Samplemain {
	public static void main(String[] args) {
		main(10);
		main("hiii");
		main(10,"hii");
		main("hii",10);
		
	}
	public static void main(int a) {
		System.out.println(a);
		
		}

	public static void main(String b) {
		System.out.println(b);
	}

	public static void main(String b,int a) {
		System.out.println(b+" "+a);
	}
	public static void main(int a,String b) {
		System.out.println(a+" "+b);
	}
}

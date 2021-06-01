package objecttopic;

public class Sample3 {
	public static void main(String[] args) {
		Sample3 s3=new Sample3();
		System.out.println(s3.hashCode());
		Sample3 s4=new Sample3();
		System.out.println(s4.hashCode());
		System.out.println("**************************");
		Sample3 s5=new Sample3();
		Sample3 s6=s5;
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
	}
}

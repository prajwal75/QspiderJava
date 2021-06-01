package Thread;

public class Sample25 {
		public void finalize()
		{
			System.out.println("invooked finalize");
		}
		public static void main(String[] args) {
			Sample25 s1=new Sample25();
			Sample25 s2=new Sample25();
			Sample25 s3=new Sample25();
			s1=null;
			s2=null;
			s3=null;
			System.out.println("hi");
			System.gc();
		}
}

package objecttopic;

public class Sample4 {
	public int hashCode(){
		return 123;
	}
	
	public static void main(String[] args) {
		Sample4 s4=new Sample4();
		System.out.println(s4.hashCode());
	}

}

package objecttopic;

public class Sample2 {
	
	int x=10;
	
	public String toString(){
		return "Hey its Sample 2 object";
	}
	
	
	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		System.out.println(s2.toString());
		System.out.println(s2.x);
	}

}

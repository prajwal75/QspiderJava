package String;

public class bintodeci {
	public static void main(String[] args) {
		int no=10101010;
		int mul=1;
		int deci=0;
		while(no!=0)
		{
			int rem=no%10;
			deci=deci+(rem*mul);
			mul=mul*2;
			no=no/10;
			
		}
		System.out.println(deci);
	}

}

package String;

public class decitobin {
	public static void main(String[] args) {
		int no=170;
		int mul=1;
		int dec=0;
		while(no!=0)
		{
			int rem=no%2;
			dec=dec+(rem*mul);
			mul=mul*2;
			no=no/2;
		}
		System.out.println(dec);
	}

}

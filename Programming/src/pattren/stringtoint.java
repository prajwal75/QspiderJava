package pattren;

public class stringtoint {
	public static void main(String[] args) {
		String s="123426";
		int no=Integer.parseInt(s);
		System.out.println(no);
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}

}

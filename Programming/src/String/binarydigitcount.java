package String;

public class binarydigitcount {
	public static void main(String[] args) {
		int no=1030030;
		int count=0;
		while(no!=0)
		{
			
			int rem=no%10;
			if((rem==0) || (rem==1))
			{
				count++;
				
			}
			no=no/10;
		}
		System.out.println(count);
	}
}

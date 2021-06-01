package samples;

public class a2c4 {
	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i%2==1)
				{
				System.out.print(ch+" ");
				}
				else
				{
					System.out.print(i+" ");
				}
				
			}
			ch++;
			System.out.println("");
		}
		
	}
	

}

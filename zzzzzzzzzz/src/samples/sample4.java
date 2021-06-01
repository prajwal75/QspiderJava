package samples;

public class sample4 {
	
	public static void main(String[] args) {
		char c='A';
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4;j++)
			{	
				
				if(i%2==1)
				{
					System.out.print('*'+" ");
					
				}
				else 
				{
					System.out.print(c+" ");
				}
				
			}
			c++;
			System.out.println(" ");
		}
	}

}

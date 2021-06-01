package samples;

public class sample3 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=4;j++)
			{	
				
				if(j<=2)
				{
					System.out.print(c+" ");
					c++;
				}
				else 
				{
					System.out.print(j+" ");
				}
				
			}
			System.out.println(" ");
		}
	}

}

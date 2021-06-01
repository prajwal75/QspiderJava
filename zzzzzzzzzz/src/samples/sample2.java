package samples;

public class sample2 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{   
			int a=1;
			char c='C';	
			for(int j=1;j<=4;j++)
			{	
				if(j<=2)
				{
				System.out.print(a+" ");
				a--;
				}
				else
				{
					System.out.print(c+" ");
					c++;
				}
			}
			System.out.println(" ");
		}
	}

}

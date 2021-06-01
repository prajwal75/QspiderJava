package pattren;

public class diamond {
	public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			space--;
			star+=2;
			System.out.println("");
		}
		space=1;
		star=5;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			space++;
			star-=2;
			System.out.println("");
		}
		
	
	}
}

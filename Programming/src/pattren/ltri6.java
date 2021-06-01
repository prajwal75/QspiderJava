package pattren;

public class ltri6 {
	public static void main(String[] args) {
		int space=3;
		int no=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=no;k--)
			{	
				System.out.print(k);
			}
			space--;
			no--;
			System.out.println("");
		}
	}
	

}

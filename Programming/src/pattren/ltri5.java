package pattren;

public class ltri5 {
	public static void main(String[] args) {
		int space=3;
		int no=1;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=no;k++)
			{
				System.out.print(i);
			}
			space--;
			no++;
			System.out.println("");
		}
		
	}

}

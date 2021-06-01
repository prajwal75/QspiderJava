package pattren;

public class tri32 {
	public static void main(String[] args) {
		int sp=0;
		int s=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=s;k++)
			{
				System.out.print(k);
			}
			sp++;
			s--;
			System.out.println("");
		}
	}

}

package pattren;

public class tri36 {
	public static void main(String[] args) {
		int space=0;
		int star=4;
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(i%2);
			}
			space++;
			star--;
			System.out.println("");
		}
	}

}

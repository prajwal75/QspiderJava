package pattren;

public class tri314 {
	public static void main(String[] args) {
		int space=0;
		int star=4;
		char z='J';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(z);
				z--;
			}
			space++;
			star--;
			System.out.println("");
		}
	}

}

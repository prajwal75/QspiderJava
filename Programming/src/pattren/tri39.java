package pattren;

public class tri39{
	public static void main(String[] args) {
	int space=0;
	int star=4;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=2;k<=star+1;k++)
		{
			System.out.print(k%2);
		}
		space++;
		star--;
		System.out.println("");
	}
}

}

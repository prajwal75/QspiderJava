package pattren;

public class Char7 {
	public static void main(String[] args) {
		char ch='P';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(ch);
				ch--;
			}
			
			System.out.println(" ");
		}
	}

}

package pattren;

public class ltri13 {
	public static void main(String[] args) {
		int space=3;
		char no='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++){
			System.out.print(" ");
			}
		
			for(char k='A';k<=no;k++)
			{
				System.out.print(k);
			}
			space--;
			no++;
			System.out.println("");
		}
	}

}

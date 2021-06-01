package pattren;
import java.util.Scanner;
public class dynatoarr {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int z=s.nextInt();
		int[] arr=new int[z];
		int k=0;
		while(k!=5)
		{
			arr[k]=s.nextInt();
			k++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}

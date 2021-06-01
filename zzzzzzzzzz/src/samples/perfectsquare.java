package samples;

import java.util.Scanner;

public class perfectsquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int y=(int)Math.sqrt(arr[i]);
			if(y==Math.sqrt(arr[i]))
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}

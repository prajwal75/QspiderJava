package pattren;

import java.util.Scanner;

public class rotate {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int z=s.nextInt();
		int[] arr=new int[z];
		System.out.println("enter "+z+"  array values");
		int k=0;
		while(k!=z)
		{
			arr[k]=s.nextInt();
			k++;
		}
		
		System.out.println("enetr the no of rotations");
		int y=s.nextInt();
		int[] a=rotat(arr,y);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	static int[] rotat(int[] arr,int times)
	
	{
		for(int j=1;j<=times;j++){
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=temp;
		}
		return arr;
		
	}

}

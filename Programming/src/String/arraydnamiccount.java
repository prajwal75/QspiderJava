package String;

import java.util.Scanner;

public class arraydnamiccount {
	 static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr=inputarray();
	System.out.println(counter(arr));
	}
	
	
	static int[] inputarray()
	{
		System.out.println("enter the size");
		int size=s.nextInt();
		int acc[]=new int[size];
		for(int i=0;i<acc.length;i++)
		{
			System.out.println("enter values");
			acc[i]=s.nextInt();
		}
		return acc;
	}
	
	static int counter(int[] arr)
	{
		System.out.println("enter the no you want");
		int find=s.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==5){
			count++;
			}
		}
		return count;
	}
}





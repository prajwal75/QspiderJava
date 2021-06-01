package com.family.unclefamily;
import java.util.Scanner;
public class deloite {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numOfChem=sc.nextInt();
		if(-1000000<=numOfChem && numOfChem<=1000000)
		{
			int ener[]=new int[numOfChem];
			for(int i=0;i<numOfChem;i++)
			{
				if(0<=i && i<=numOfChem)
					ener[i]=sc.nextInt();
			}
			for(int i=0;i<=numOfChem;i++)
			{
				if(1<=ener[i] && ener[i]<=1000000)
				{
					int sum=0,rem=0,num=ener[i];
					while(num>0)
					{
						rem=num%10;
						sum=sum+rem;
						num=num/10;
					}
				}
			}
		}
		
	}
}

package samples;

import java.util.Scanner;

public class Arrayadd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter arr1 array size");
		int n1=sc.nextInt();
		int [] arr1=new int[n1];
		int i=0;
		System.out.println("ENter arr1 array ele");
		while(i<n1)
		{
			arr1[i]=sc.nextInt();
			i++;
		}
		i=0;
		System.out.println("ENter arr2 array size");
		int n2=sc.nextInt();
		int [] arr2=new int[n2];
		System.out.println("ENter arr2 array ele");
		while(i<n2)
		{
			arr2[i]=sc.nextInt();
			i++;
		}
		int [] arr4=new int[n1+n2];
		arr4=SortedArray(n1,arr1,n2,arr2);
		
		for(int z=0;z<n1+n2;z++){
			System.out.print(arr4[z]);
			}
		
	}
	
	static int[] SortedArray(int n1,int[] arr1,int n2,int [] arr2)
	{
		int [] arr3=new int[n1+n2];
		int i=0,k=0,j=0;
		while(i<n1)
		{
			arr3[i]=arr1[i];
			i++;
			k++;
		}
		while(k<n2+n1)
		{
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		int n=n1+n2;
		for(int x=0;x<n-1;x++)
		{
			for(int c=0;c<n-1;c++)
			{
				if(arr3[c]>arr3[c+1])
					{
						int temp=arr3[c];
						arr3[c]=arr3[c+1];
						arr3[c+1]=temp;
					}
			}
		}
	
		return arr3;
	}
}

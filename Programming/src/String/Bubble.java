package String;

public class Bubble {
	public static void main(String[] args) {
		int arr[]={4,3,1,0,5};
		int n=arr.length;
		for(int j=0;j<n-1;j++)
		{
				for(int i=0;i<n-1;i++)
				{
					if(arr[i]>arr[i+1])
						{
							int temp=arr[i];
							arr[i]=arr[i+1];
							arr[i+1]=temp;
						}
				}
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
		}
		
	}
}

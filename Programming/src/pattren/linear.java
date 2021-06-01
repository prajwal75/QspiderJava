package pattren;

public class linear {
	 public static void main(String[] args) {
		int arr[]={1,4,5,4,2,3,8,9};
		int find=3;
		for(int i=0;i<arr.length;i++)
		{
			if(find==arr[i])
			{
				System.out.println("the num is found at index  "+i);
			}
		}
		
	}

}

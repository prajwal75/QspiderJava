package String;

public class reversearray {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,5};
		int no=arr.length;
		int count=0;
		for(int i=no-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		for(int i=no-1;i>=0;i--){
			if(arr[i]==5)
			{
				
				count++;
				
			}
			
		}
		System.out.println(" ");
		System.out.println(count);
	}

}

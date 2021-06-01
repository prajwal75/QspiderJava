class Revstrng 
{
	public static void main(String[] args) 
	{
		String s1="Java";
		String rev="";
		for(int i=3;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}

		System.out.println(rev);
	}
}

class Pali 
{
	public static void main(String[] args) 
	{
		String s1="MOM";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(rev.equals(s1))
		{
		System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}

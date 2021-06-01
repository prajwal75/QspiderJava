package pattren;

public class sepalpha {
	public static void main(String[] args) {
		String s1="ba2jc7b!31#6$&&6";
		String s2="";
		String s3="";
		String s4="";
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(s1.charAt(i)))
			{
				s2=s2+s1.charAt(i);
			}
			else if(Character.isDigit(s1.charAt(i)))
			{
				s3=s3+s1.charAt(i);
			}
			else{
				s4=s4+s1.charAt(i);
			}
		}
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}

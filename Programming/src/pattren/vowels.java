package pattren;

public class vowels {
	public static void main(String[] args) {
		String s1="ikjubaunudvjnknzmnvoiwjfaagnikndgizgiuaiuaphnjxbv";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char a=s1.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

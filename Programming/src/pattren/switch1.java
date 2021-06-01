package pattren;

import java.util.Scanner;

public class switch1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		char input =s.next().charAt(0);
		
		switch(input)
		{
		case 'A': System.out.println("the num is 9");
				break;
		case 'B':System.out.println("the num is 10");
				break;
		case 'C':System.out.println("the num is 11");
				break;
		default : System.out.println("invalid");
		
					break;
			}
		}

}

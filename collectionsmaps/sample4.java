package collectionsmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sample4 
{
	public static void main(String[] args) 
	{
		TreeMap<String,Integer> l1=new TreeMap<String,Integer>();
		l1.put("dinga",10);
		l1.put("dingi",20);
		l1.put("pega",20);
		l1.put("hello",356);
		
		System.out.println(l1);	
		
		for(Map.Entry<String, Integer> o1:l1.entrySet())
		{
			System.out.println(o1.getKey()+"  "+o1.getValue());
		}

	}

}

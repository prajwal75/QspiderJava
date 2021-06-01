package pattren;

import java.util.HashMap;
import java.util.Map.Entry;

public class mapss {
	public static void main(String[] args) {
		
	
	HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("a",1);
		h.put("b",2);
		h.put("c",3);
		h.put("d",3);
		h.put("a",10);
		
		for(Entry<String,Integer> o: h.entrySet())
		{
			System.out.println(o.getKey()+ "  "+ o.getValue());
		}
	}	
}

package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map4 {
	public static void main(String[] args) {
		Map<Character,Integer> m= new HashMap<Character,Integer>(); 
		char[] ch={'A','G','V','A','N','S','A','N'};
		for(char s:ch)
		{
			if(!m.containsKey(s))
			{
				m.put(s,1);
			}
			else
			{
				int count=m.get(s);
				m.put(s, count+1);
			}
		}
		int l=0;
		char c='z';
		
		for(Entry<Character,Integer> w: m.entrySet())
		{
			if(w.getValue()>l)
			{
				l=w.getValue();
				c=w.getKey();
			}
			
			
		}
		System.out.println(c+" "+l);
	}
}

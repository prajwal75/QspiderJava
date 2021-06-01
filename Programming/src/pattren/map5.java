package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map5 {
	public static void main(String[] args) {
		Map<Integer,Integer> m= new HashMap<Integer,Integer>(); 
		int [] ch={1,2,3,3,2,1,23,4,3,2,11,2,3,2,2};
		for(int s:ch)
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
		int c=0;
		
		for(Entry<Integer,Integer> w: m.entrySet())
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


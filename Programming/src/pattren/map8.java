package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map8 {
	public static void main(String[] args) {
		Map<Long,Integer> m=new HashMap<Long,Integer>();
		long [] a={1,2,3,1,3,5,2,4,4,2,5,55,636,5,5,5,23,2,2,4,4,6,3,3};
		for(long s:a)
		{
			if(!m.containsKey(s))
			{
				m.put(s, 1);
			}
			else
			{
				int count=m.get(s);
				m.put(s,count+1);
			}
			
		}
		int l=0;
		long s=0;
		for(Entry<Long,Integer> o: m.entrySet())
		{
			if(o.getValue()>l)
			{
				l=o.getValue();
				s=o.getKey();
			}
		
		}
		System.out.println(s+" "+l);
		
	}

}

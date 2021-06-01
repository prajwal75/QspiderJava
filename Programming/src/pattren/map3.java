package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map3 {
	public static void main(String[] args) {
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		int[] a={1,2,3,4,2,2,1,3,5,2,2,4,6,8,5,2,3};
		for(int s:a)
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
		int s=0;
		
		for(Entry<Integer,Integer> e:m.entrySet())
		{
			if(e.getValue()>l)
			{
				l=e.getValue();
				s=e.getKey();
			}
			
	
		}
		System.out.println(s+" "+l);
	}

}

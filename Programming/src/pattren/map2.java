package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map2 {
	public static void main(String[] args) {
		Map<Short,Integer> m=new HashMap<Short,Integer>();
		short[] a={1,2,3,4,3,2,3,5,5,3,6,8,3,5};
		for(Short s:a)
		{
			if(!m.containsKey(s))
			{
				m.put(s, 1);
			}
			else
			{
				int count=m.get(s);
				m.put(s, count+1);
			}
		}
		
		for(Entry<Short,Integer> w:m.entrySet())
			{
				System.out.println(w.getKey()+" "+w.getValue());
			}
		}

}

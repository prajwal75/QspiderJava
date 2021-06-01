package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map6 {
	public static void main(String[] args) {
		Map<Float,Integer> m= new HashMap<Float,Integer>(); 
		float[] ch={1.3f,16.4f,1.6f,45.4f,32.4f,32.2f,1.3f};
		for(float s:ch)
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
		float c=0.0f;
		
		for(Entry<Float,Integer> w: m.entrySet())
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

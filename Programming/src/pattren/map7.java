package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map7 {
	public static void main(String[] args) {
		Map<Double,Integer> m= new HashMap<Double,Integer>(); 
		double[] ch={1.3,16.4,1.6,45.5,32.4,32.2,1.3};
		for(double s:ch)
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
		double c=0.0f;
		
		for(Entry<Double,Integer> w: m.entrySet())
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

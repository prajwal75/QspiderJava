package pattren;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class map1 {
	public static void main(String[] args) {
		Map<Byte,Integer> m=new HashMap<Byte,Integer>();
		byte [] a={1,2,3,4,5,6,4,3,2,4,5,6,7,3};
		for(byte s:a)
		{
			if(!m.containsKey(s))
			{
				m.put(s, 1);
			}
			else{
				int count=m.get(s);
				m.put(s, count+1);
			}
		}
		int l=0;
		Byte s=0;
		for(Entry<Byte, Integer> w:m.entrySet())
		{
			if(w.getValue()>l)
			{
			l=w.getValue();
			s=w.getKey();
			}
			
		}
		System.out.println(s+" "+l);
	}

}

package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapss3 {
	public static void main(String[] args) {
		Map<String,Integer> h=new HashMap<String,Integer>();
		String[] s={"ho","hi","ho","hi","jd","ks","hd"};
		for(String y:s)
		{
			if(!h.containsKey(y))
			{
				h.put(y,1);
			}
			else{
				int count= h.get(y);
				h.put(y, count+1);
			}
			
		}
		for(Entry<String,Integer> d:h.entrySet())
		{
			System.out.println(d.getKey()+ "  "+d.getValue());
		}
	}

}

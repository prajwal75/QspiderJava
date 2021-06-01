package pattren;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapss4 {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		String[] s={"ho","hi","hi","hi" ,"ho","jd","ks","hd"};
		for(String y:s)
		{
			if(!m.containsKey(y))
			{
				m.put(y, 1);
				
			}
			else
			{
				int count=m.get(y);
				m.put(y, count+1);
			}
		}
		int lar=0;
		String w=null;
		for(Entry<String,Integer> o:m.entrySet())
		{
			if(o.getValue()>lar)
			{
				lar=o.getValue();
				w=o.getKey();
				
			}
		}
		System.out.println(w+" "+lar);
	}

}

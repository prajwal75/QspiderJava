package hashmap;
import java.util.Map;
import java.util.TreeMap;
public class Treemaaap {
	public static void main(String[] args) {
		TreeMap<String,Integer> l1=new TreeMap<String,Integer>();
		l1.put("dinga",123);
		l1.put("dingi",124);
		l1.put("kencha",123);
		l1.put("penga", 126);
		l1.put("kencha",129);
		System.out.println(l1);
		for(Map.Entry<String, Integer> o1: l1.entrySet())
		{
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}

}

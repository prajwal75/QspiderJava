package pattren;

import java.util.HashMap;

public class mapss2 {
	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("a", 1);
		h.put("b", 2);
		h.put("c", 3);
		h.put("d", 4);
		h.put("c", 5);
		System.out.println(h.get("c"));
		System.out.println(h.containsKey("b"));
		System.out.println(h.containsValue(4));
				
	}

}

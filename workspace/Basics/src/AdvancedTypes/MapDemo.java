package AdvancedTypes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("greeting", "Good Morning");
		map.put("goodbye", "Good day sir (in british accent)");
		map.put("dracula", "Good evening");
		
		System.out.println(map.get("dracula"));
		Set<Entry<String, String>> set = map.entrySet();
		
		Iterator<Entry<String, String>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry mp = (Map.Entry)iter.next();
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}
	}
}
 
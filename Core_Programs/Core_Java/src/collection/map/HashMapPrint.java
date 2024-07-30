package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapPrint {
	public static void main(String[] args) {
		
		System.out.println(" HashMap Programs... ");
		
		HashMap<Integer, String> map = new HashMap<>(); 
		
		map.put(101, "Gautam");
		map.put(10, "Manoj");
		map.put(121, "Nirmal");
		map.put(91, "Nutan");
		map.put(45, "Archana");
		map.put(50, "Hirday");
		map.put(75, "Vamsi");
		map.put(111, "Vaibhav");
		map.put(151, "Gaurav");
		
		System.out.println(map.size());
		
//		for(Entry<Integer, String> mp : map.entrySet()) {
//			System.out.println(mp.getKey()+" -> "+mp.getValue());
	//	}
	
		Set<Integer> keys = map.keySet();
		Iterator it = keys.iterator();
		//System.out.println(keys);
		System.out.println(" ------- 2nd Way ----------------");
		while(it.hasNext()) {
			int key = (int)it.next();
			//System.out.println(" Key: "+key);
			System.out.println(key +" -> "+map.get(key));
			//System.out.println(" Key: "+it.next());
		}
		
		System.out.println(" ----------------- 3rd Way -----------------");
		
		map.entrySet().stream().forEach(k -> System.out.println(k.getKey() + " -> "+k.getValue()));
		
		map.entrySet().stream().forEach( k -> {
			if(k.getValue().startsWith("G")) {
				System.out.println(k.getKey() +" "+k.getValue());
			}
		});
		
//		map.entrySet().stream().map( k -> {
//			if(k.getValue().startsWith("G")) {
//				System.out.println(k.getKey() +" "+k.getValue());
//			}
//		}).collect(Collectors.toMa)
		
		System.out.println(" -------------------- 4th Way -------------");
		for(String str : map.values()) {
			System.out.println(str);
		}
		
		System.out.println(" -------------------- 5th Way -------------");
		//Map.Entry<Integer, String> entrySet = (Map.Entry<Integer, String>)map.entrySet();
		
		//System.out.println(entrySet);
		System.out.println(map);
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>(map);
		System.out.println(" LinkedHashMap data ");
		System.out.println(lmap);
	}
}
package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapSort {
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
		
		Map<Integer, String> sMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).
				collect(LinkedHashMap::new, (map1, entry) -> map1.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);

		//forEach(x -> System.out.println(x.getKey() +" ->"+x.getValue()));
		
		System.out.println("\n Original Data: "+map);
		
		System.out.println("\n Sorted Map Data: "+sMap);
		
	}
}

package AdvancedTypes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>(Arrays.asList("a", "b", "c"));
		
		for (String value : set) {
			System.out.print(value);
		}
		System.out.println("\n-------------------");
		set.add("d");
		set.add("e");
		System.out.println("Size of set: " + set.size());
		set.add("e");
		System.out.println("Size of set after adding duplicate value 'e': " + set.size());
		System.out.println("Note set does not add duplicate");
		
		set.forEach(System.out::print);
		System.out.println("\n-------------------");
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}

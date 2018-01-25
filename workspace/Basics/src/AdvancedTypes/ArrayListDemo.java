package AdvancedTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		array.add(7);
		array.add(8);
		array.add(8);
		array.set(3, 22);
		System.out.println("INDEX 0: " +array.get(0));
		array.remove(6);
		for (Integer value : array) {
			System.out.println(value);
		}
		System.out.println("INDEX OF VALUE 6: " + array.indexOf(6));
		System.out.println("Length of array: " + array.size());
		System.out.println("Checking if array is empty: " + array.isEmpty());
		array.clear();
		System.out.println("Checking if array is empty after clearing: " + array.isEmpty());
	}
}

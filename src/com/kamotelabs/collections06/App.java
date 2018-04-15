package com.kamotelabs.collections06;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}

}

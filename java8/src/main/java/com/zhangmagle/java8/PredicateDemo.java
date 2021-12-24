package com.zhangmagle.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {
	
	public List<String> filterList() {
		List<String> names = Arrays.asList("Lucy", "Ada", "Tom", "John", "Lily");
		
		List<String> results = names.stream()
				.filter(name -> name.startsWith("L"))
				.collect(Collectors.toList());
		
		return results;
	}

}

package com.zhangmagle.java8;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PredicateDemoTest {
	
	PredicateDemo predicateDemo = new PredicateDemo();
	
	@DisplayName("Java 8 Predicate demo")
	@Test
	void testPredicateDemo() {
		
		List<String> results = predicateDemo.filterList();
		
		Assertions.assertEquals(2, results.size());
		assertTrue(results.contains("Lucy"));
	}

}

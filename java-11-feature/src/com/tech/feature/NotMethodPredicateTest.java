package com.tech.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotMethodPredicateTest {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "\n", "HTML", " ");

		List<String> filters = list.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());

		filters.forEach(filter -> System.out.println(filter));
	}
}

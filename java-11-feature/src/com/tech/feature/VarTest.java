package com.tech.feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarTest {
	public static void main(String[] args) {
		var str = "world";
		System.out.println(str);

		List<String> tutorialsList = Arrays.asList("Java", "HTML");

		String tutorials = tutorialsList.stream().map((var tutorial) -> tutorial.toUpperCase())
				.collect(Collectors.joining(", "));

		System.out.println(tutorials);
	}
}

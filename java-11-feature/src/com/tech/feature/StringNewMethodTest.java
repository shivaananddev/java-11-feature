package com.tech.feature;

import java.util.stream.Collectors;

public class StringNewMethodTest {
	public static void main(String[] args) {
		String str = "Its java \n 11 program..";

		// repeat
		System.out.println(str.repeat(5));

		// isEmpty
		System.out.println(str.isEmpty());

		// strip
		String strip = '\u2001' + " String    with    space" + '\u2001';
		System.out.println("After trim: " + strip.strip());

		// strip apply in start
		System.out.println(strip.stripLeading());

		// strip apply in end
		System.out.println(strip.stripTrailing());

		// lines it splits with \n and get return Stream<String>
		System.out.println(str.lines().collect(Collectors.toList()));
	}
}

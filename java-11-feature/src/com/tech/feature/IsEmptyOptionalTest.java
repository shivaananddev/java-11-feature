package com.tech.feature;

import java.util.Optional;

public class IsEmptyOptionalTest {
	public static void main(String[] args) {
		String name = null;

		System.out.println(!Optional.ofNullable(name).isPresent());
		System.out.println(Optional.ofNullable(name).isEmpty());

		name = "tech";
		System.out.println(!Optional.ofNullable(name).isPresent());
		System.out.println(Optional.ofNullable(name).isEmpty());
	}
}

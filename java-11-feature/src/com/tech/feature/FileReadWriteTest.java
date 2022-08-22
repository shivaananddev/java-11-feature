package com.tech.feature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileReadWriteTest {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("src/resource/demo.txt");

		// read files
		System.out.println(Files.readString(path));

		// write files
		Files.writeString(path, "\nHello There", StandardOpenOption.APPEND);

	}
}

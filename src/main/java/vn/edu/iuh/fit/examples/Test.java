package vn.edu.iuh.fit.examples;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File projectDir = new File("F:\\java_phanTan\\lab4_reactivestream_gson");
		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			System.out.println(path);
		}).explore(projectDir);
	}
}

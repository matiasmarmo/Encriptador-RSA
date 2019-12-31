package TextFileManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileCommons {
	private static TextFileCommons instance = new TextFileCommons();

	private TextFileCommons(){}

	public static TextFileCommons getInstance(){
		return instance;
	}

	public int numberOfLines(String fileName) {
		int lines = 0;
		try {
			FileReader readfile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(readfile);
			while (reader.readLine() != null) lines++;
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(lines);
		return lines;
	}
}

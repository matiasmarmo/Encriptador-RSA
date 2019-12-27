package TextFileManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
	public void read(String fileName, int initialLineNumber, int length){
		int lineNumber;
		int finalLineNumber = initialLineNumber + length;
		int FileNumberOfLines = numberOfLines(fileName);
		String text = "";
		try {
			FileReader readfile = new FileReader(fileName);
		    BufferedReader readbuffer = new BufferedReader(readfile);
		    for (lineNumber = 1; lineNumber < FileNumberOfLines; lineNumber++) {
		    	if (lineNumber >= initialLineNumber && lineNumber < finalLineNumber) {
		    		text = text + readbuffer.readLine();
		        } else
		        	readbuffer.readLine();
		    }
		    readbuffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" The specific Line is: " + text);
	}
	
	private int numberOfLines(String fileName) {
		int lines = 0;
		try {
			FileReader readfile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(readfile);
			while (reader.readLine() != null) lines++;
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
}

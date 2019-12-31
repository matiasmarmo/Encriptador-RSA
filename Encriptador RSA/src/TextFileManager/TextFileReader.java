package TextFileManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
	public String read(String fileName, int initialLineNumber, int length){
		int lineNumber;
		int finalLineNumber = initialLineNumber + length;
		
		TextFileCommons helper = TextFileCommons.getInstance();
		int FileNumberOfLines = helper.numberOfLines(fileName);
		
		String text = "";
		try {
			FileReader readfile = new FileReader(fileName);
		    BufferedReader readbuffer = new BufferedReader(readfile);
		    for (lineNumber = 0; lineNumber < FileNumberOfLines; lineNumber++) {
		    	if (lineNumber >= initialLineNumber && lineNumber < finalLineNumber) {
		    		text = text + readbuffer.readLine();
		        } else
		        	readbuffer.readLine();
		    }
		    readbuffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
}

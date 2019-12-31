package TextFileManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileAddLine {
	public void addLine(String fileName, String newText, int lineToAdd){
		lineToAdd = lineToAdd - 1;

		TextFileCommons helper = TextFileCommons.getInstance();
		int FileNumberOfLines = helper.numberOfLines(fileName);
		
		String text = "";
		try {
			FileReader readfile = new FileReader(fileName);
		    BufferedReader readbuffer = new BufferedReader(readfile);
		    for (int lineNumber = 0; lineNumber < FileNumberOfLines; lineNumber++) {
		    	if (lineNumber == lineToAdd) {
		    		text = text + newText + System.lineSeparator()
		    				    + readbuffer.readLine() + System.lineSeparator();  		
		        } else
		        	text = text + readbuffer.readLine() + System.lineSeparator();
		    }
		    readbuffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		TextFileWriter writer2 = new TextFileWriter();
		writer2.write(fileName,text);
	}
}

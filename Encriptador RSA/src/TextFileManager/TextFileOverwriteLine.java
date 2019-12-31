package TextFileManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileOverwriteLine {
	public void overwriteLine(String fileName, String newText, int lineToChange){
		lineToChange = lineToChange - 1;
		int FileNumberOfLines = numberOfLines(fileName);
		String text = "";
		try {
			FileReader readfile = new FileReader(fileName);
		    BufferedReader readbuffer = new BufferedReader(readfile);
		    for (int lineNumber = 0; lineNumber < FileNumberOfLines; lineNumber++) {
		    	if (lineNumber == lineToChange) {
		    		readbuffer.readLine();
		    		text = text + newText + System.lineSeparator();  		
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

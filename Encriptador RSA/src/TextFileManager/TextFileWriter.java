package TextFileManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
	//String fileName = "temp.txt";
	public void write(String fileName, String textLine){
	    try {
	        FileWriter fileWriter = new FileWriter(fileName, true);
	
	        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	
	        bufferedWriter.write(textLine);
	        bufferedWriter.newLine();

	        bufferedWriter.close();
	    }
	    catch(IOException ex) {
	        System.out.println("Error writing to file '"+ fileName + "'");
	    }
	}
}

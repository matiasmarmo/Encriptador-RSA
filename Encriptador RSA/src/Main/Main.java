package Main;

import TextFileManager.TextFileWriter;

public class Main {
	public static void main(String [] args) {
		TextFileWriter writer = new TextFileWriter();
		writer.write("C:\\Users\\matum\\Desktop\\ab.txt","hola");
		writer.write("C:\\Users\\matum\\Desktop\\ab.txt","que");
		writer.write("C:\\Users\\matum\\Desktop\\ab.txt","tal");
	}
}

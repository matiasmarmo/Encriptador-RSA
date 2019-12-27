package Main;

import RSA_Module.Encryptor;
import TextFileManager.TextFileReader;
import TextFileManager.TextFileWriter;

public class Main {
	public static void main(String [] args) {
		String fileName = "C:\\Users\\matum\\Desktop\\ab.txt";
		
		TextFileWriter writer = new TextFileWriter();
		writer.write(fileName,"hola que tal ,,,daanonv  ?");
		writer.write(fileName,"que haces maquina ? asdasd");
		writer.write(fileName,"tal vez ?");
		writer.write(fileName,"lalalal sd");
		writer.write(fileName,"vamos a bailar");
		
		TextFileReader reader = new TextFileReader();
		reader.read(fileName,3,2);
		
		Encryptor a = new Encryptor();
		a.encrypt("ab", 83, 89, 5009);
	}
}

package Main;

import RSA_Module.Decryptor;
import RSA_Module.Encryptor;
import TextFileManager.TextFileAddLine;
import TextFileManager.TextFileOverwriteLine;
import TextFileManager.TextFileReader;
import TextFileManager.TextFileWriter;

public class Main {
	public static void main(String [] args) {
		String fileName = "C:\\Users\\matum\\Desktop\\ab.txt";
		String mensaje = "abcdefghijklmnopqrstuvwxyz";
		
	/*	Encryptor a = new Encryptor();
		String encryptado = a.encrypt(mensaje, 83, 89, 5009);
		
		TextFileWriter writer = new TextFileWriter();
		writer.write(fileName,encryptado);
		
		TextFileReader reader = new TextFileReader();
		String mensajeLeido = reader.read(fileName,0,5);
		
		Decryptor b = new Decryptor();
		String desencryptado = b.decrypt(mensajeLeido, 83, 89, 2753);
		System.out.println(desencryptado);*/
		
	/*	TextFileWriter writer = new TextFileWriter();
		writer.write(fileName,"hola que tal ,,,daanonv  ?");
		writer.write(fileName,"que haces maquina ? asdasd");
		writer.write(fileName,"tal vez ?");
		writer.write(fileName,"lalalal sd");
		writer.write(fileName,"vamos a bailar");

		TextFileReader reader = new TextFileReader();
		reader.read(fileName,0,6);*/
		
		/*TextFileOverwriteLine ov = new TextFileOverwriteLine();
		ov.overwriteLine(fileName, "carlos", 5);*/
		
		TextFileAddLine ove = new TextFileAddLine();
		ove.addLine(fileName, "jose", 1);
	}
}

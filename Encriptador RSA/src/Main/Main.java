package Main;

import RSA_Module.Decryptor;
import RSA_Module.Encryptor;
import TextFileManager.TextFileReader;
import TextFileManager.TextFileWriter;

public class Main {
	public static void main(String [] args) {
		String fileName = "C:\\Users\\matum\\Desktop\\ab.txt";
		String mensaje = "abcdefghijklmnopqrstuvwxyz";
		
		Encryptor a = new Encryptor();
		String encryptado = a.encrypt(mensaje, 83, 89, 5009);
		
		TextFileWriter writer = new TextFileWriter();
		writer.write(fileName,encryptado);
		
		TextFileReader reader = new TextFileReader();
		String mensajeLeido = reader.read(fileName,0,5);
		
		Decryptor b = new Decryptor();
		String desencryptado = b.decrypt(mensajeLeido, 83, 89, 2753);
		System.out.println(desencryptado);
	}
}

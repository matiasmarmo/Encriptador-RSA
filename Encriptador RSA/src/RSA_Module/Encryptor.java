package RSA_Module;

public class Encryptor {
	public String encrypt(String msg, int p,int q, int e){
		int n;

	    n = calculateN(p,q);

	    String encryptedText = encryptMsg(msg,e,n);
	    return encryptedText;
	}

	private int calculateN(int p, int q){
	    return p*q;
	}

	private String encryptMsg( String msg, int e, int n ){
	    String encryptedText = "";
		for(int i=0; i<msg.length();i++) {
	    	encryptedText = encryptedText + encryptChar(msg.charAt(i),e,n);
	    }
	    return encryptedText;
	}
	
	private String encryptChar( char character, int e, int n ){
		int current, result;
	    current = (int) character;
	    result = 1;
	    for ( int i = 0; i < e; i++ ){
	        result = result * current;
	        result = result % n;
	    }
	    String resultado = String.valueOf(result);
	    if(resultado.length()<4) {
	    	resultado = "0" + resultado;
	    }
	    return resultado;
	}
}

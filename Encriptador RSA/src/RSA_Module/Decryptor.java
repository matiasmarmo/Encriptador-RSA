package RSA_Module;

public class Decryptor {
	public String decrypt(String msg, int p,int q, int d){
		int n;

	    n = calculateN(p,q);

	    String decryptedText = decryptMsg(msg,d,n);
	    return decryptedText;
	}

	private int calculateN(int p, int q){
	    return p*q;
	}
	
	private String decryptMsg( String msg, int d, int n ){
	    String decryptedText = "";
	    String substring = "";
		for(int i=0; i<msg.length();i=i+4) {
			substring = msg.substring(i, i+4);
	    	decryptedText = decryptedText + decryptChar(substring,d,n);
	    }
	    return decryptedText;
	}
	
	private String decryptChar( String characterInNumbers, int d, int n){
	    int current, result;
	    current =  Integer.parseInt(characterInNumbers);
	    result = 1;
	    for ( int i = 0; i < d; i++ ){
	        result = result * current;
	        result = result % n;
	    }
	    return Character.toString((char)result);
	}
}

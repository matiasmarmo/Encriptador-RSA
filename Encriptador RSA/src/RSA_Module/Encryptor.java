package RSA_Module;

public class Encryptor {
	public String encrypt(String msg, int p,int q, int e){
		int n;

	    n = calculateN(p,q);
	  
	   // phi = calculatePhi(p,q);

	    String encryptedText = encryptMsg(msg,e,n);
	    return encryptedText;
	}

	private int calculateN(int p, int q){
	    return p*q;
	}
	
/*	private int calculatePhi(int p, int q){
	    return ( p - 1 ) * ( q - 1 );
	}

	private int calculateD(int e, int phi){
	    int d;
	    int k = 1;
	    while ( true ){
	        k = k + phi;
	        if ( k % e == 0){
	            d = (k / e);
	            return d;
	        }
	    }
	}*/

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
	    System.out.println(result);
	    return String.valueOf(result);
	}
}

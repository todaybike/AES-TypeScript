import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
 
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.io.*;
// import Crypto;

public class j2 { 
  public static void main(String[] args)
      throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException,
      IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException,
      FileNotFoundException, IOException {

      HCrypto hcrypto = new HCrypto();
      
      String key = "abcdefghijklmnopqrstuvxyz0123456";
      BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );

      System.out.println("암호화할 문자열을 입력하세요.");
      
      String line = reader.readLine();
      reader.close();
      System.out.println( line );

      String enc = hcrypto.encrypt( line, key );
        
      File file = new File("e2.out");
      BufferedWriter output = new BufferedWriter( 
            new OutputStreamWriter(
                new FileOutputStream(file.getPath()),"UTF8") );

      output.write( enc );
      output.close();

  }
}

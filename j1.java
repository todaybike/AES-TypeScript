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

public class j1 { 
  public static void main(String[] args)
      throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException,
      IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException,
      FileNotFoundException, IOException {

        HCrypto hcrypto = new HCrypto();

        String key = "abcdefghijklmnopqrstuvxyz0123456";
    BufferedReader reader = new BufferedReader( new FileReader("e1.out"));
    String line = reader.readLine();

    // System.out.println("e.out 에서 읽어 들인 문자열");
    System.out.println( line );
    // System.out.println("복호화한 문자열, aes1.ts 와 비교.");
    System.out.println ( hcrypto.decrypt( line, key ) );

    reader.close();
  }
}

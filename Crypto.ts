//
// Crypto.ts
// 2019.4.2
// 
// with AES.ts
//
import * as aesjs from './AES'

export default class Crypto {

    private key : string = "abcdefghijklmnopqrstuvxyz0123456"; // 32byte
    
    // The initialization vector (must be 16 bytes)
    private iv : number[] = [ 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,35, 36 ];


    public encrypt( text : string ) : string {
        // Convert text to bytes (text must be a multiple of 16 bytes)
        // let textBytes = aesjs.utils.utf8.toBytes(text);
        let textBytes = aesjs.ConvertUtf8.toBytes(text);

        let mod = textBytes.length % 16;
        if ( mod % 16 != 0 ) {
            text += ''.padStart(16 - mod);
            textBytes = aesjs.ConvertUtf8.toBytes(text);
        }
                
        let aesCbc = new aesjs.ModeOfOperationCBC(
            aesjs.ConvertUtf8.toBytes(this.key), this.iv);

        let encryptedBytes = aesCbc.encrypt(textBytes);
    
        // To print or store the binary data, you may convert it to hex
        let encryptedHex = aesjs.ConvertHex.fromBytes(encryptedBytes);

        return encryptedHex;
    }

    public decrypt( text : string ) : string {
        let encryptedBytes = aesjs.ConvertHex.toBytes( text );

        // The cipher-block chaining mode of operation maintains internal
        // state, so to decrypt a new instance must be instantiated.
        var aesCbc = new aesjs.ModeOfOperationCBC(aesjs.ConvertUtf8.toBytes(this.key), this.iv);
        var decryptedBytes = aesCbc.decrypt(encryptedBytes);
        
        // Convert our bytes back into text
        var decryptedText = aesjs.ConvertUtf8.fromBytes(decryptedBytes).trim();

        return decryptedText;
    }   

} // end of class

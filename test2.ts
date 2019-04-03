import Crypto from "./Crypto";

class test2 {
    public main() : void {
    const fs = require('fs');

    fs.readFile('e2.out','utf8', function(err:any,line:string) {
        if ( err ) throw err;
    
        console.log( line );
    
        let c = new Crypto();
    
        // console.log("aes2 line="+line);
        console.log( "" + c.decrypt(line) );
    
    });

    }

}

let t22 = new test2();
t22.main();

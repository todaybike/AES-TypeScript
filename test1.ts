import Crypto from "./Crypto";

class test1 {
    public main() : void {
        const fs = require('fs');
        const readline = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        })
        
        readline.question(`암호화할 문자열을 입력하세요.\n`,
            (msg:string) => {
                
                readline.close();

                let c = new Crypto() ;
                let enc = c.encrypt( msg );

                console.log(`${enc}`);
                fs.writeFileSync('e1.out', enc );
            }
        );
    }
}

let t11 = new test1();
t11.main();

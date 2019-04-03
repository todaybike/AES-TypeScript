# AES-TypeScript

자바스크립트로 되어 있던 AES 암호화 함수를 타입스크립트로 변형하였다.
아래 사이트의 자바스크립트를 기반으로 작성하였습니다.

https://raw.githubusercontent.com/ricmoo/aes-js/e27b99df/index.js

<pre>
TypeScript(javascript), Java (tomcat 등) 에서 암복호화하기 위하여 개발했다.
다양한 방법을 시도하였으나, 암호복화가 제대로 수행되는 결과를 찾기가 쉽지 않았다.
비슷한 문제로 고민하는 분이 있다면 참고하셔도 좋겠습니다.

Vue.js 에서 이용할 수 있는 예제도 정리 중이다.
</pre>

2019.4.2
<code>
# 타입스크립트 컴파일
  tsc

# java 컴파일
  javac -classpath . Crypto.java
  javac -classpath . j1.java
  javac -classpath . j2.java

# 실행 방법
  node test1      > 타입스트립트에서 암호화하여 e1.out 에 저장.
  java j1         > e1.out 에서 읽어 복호화
  java j2         > java 에서 암호화하여 e2.out 에 저장.
  node test2         > e2.out 파일에서 읽어서 복호화

</code>

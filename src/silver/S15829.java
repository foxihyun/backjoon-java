/*
BOJ 15829 (Hashing)

-> 서브테스크도 주의해서 보기 (large , small 나뉘어져 있음)  큰 단위도 생각해보라는 것

입력
문자열 길이 L
영문 소문자로 이루어진 문자열

일단
1. 변수 Alpha: 'a'~'z' 1부터 26 대응 시키기
2. 문자열 a[i]라면 31^i

1*2해서 total에 더해주기

3. 출력은 total % 1234567891


생각해보니 L은 50까지 -> 31 ^50 승까지 받아야함. 입력을
그럼 int단위로 힘들다. long으로 시도
-> 그래도  안됨 -> 애초에 31^50승은 long단위로도 커버가 안됨

그러면 모듈러 연산을 해줘야겠구나..
(long)Math.pow(31,i); 얘를 낮춰줘야함.

원래는 결과에서 % 1234567891를 해줬음

하지만  범위가 너무 커서 add 안에 담지 못한다.

그러면 애초에 모듈러 연산을 해줘야하는데 어떻게?


최댓값 26 * (3^50)이다
 어차피 출력값의 범위는 1~1234567891이다. long으로 담는다해도 큼
3^50


내 코드에서 문제점 -> Math.pow(31, i)를 씀
→ 이건 double 기반이라 큰 수에서 정밀도 문제도 생김

다른 방식으로 구현해야겠다 생각해야함

모듈러 연산 덧셈 , 곱셈 , 거듭제곱은 mod 분배법칙 성립


 */
package silver;

import java.util.Scanner;

public class S15829 {
    static int AlphaToInt(char A)
    {
        int changeA = A;
        return changeA - 96; // return 값은 a= 1 ~ z =26으로
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String st = sc.next();
        long total = 0;
        long r=1;
        long M = 1234567891;
        for(int i=0;i<st.length();i++)
        {
            total = (total + AlphaToInt(st.charAt(i)) * r) % M;
            r = (r * 31) % M;
        }
        System.out.println(total % 1234567891);
    }
}

package bronze;

import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++) {
            int cond = 0; //판별용
            int sum = 0;// 테스트 케이스 입력
            //condi = 1이면 이전이 O로 취급. sum에다가 +1 더해주기.
            String test = sc.next();

            for(int j=0;j<test.length();j++) {
                if (test.charAt(j) == 'O') {
                    ++cond;
                    sum += cond;
                } else {
                    cond = 0;
                }
                //질문1 char O = "O";
                // if(O.equals(test.charAt(j))로 불가능. 문자열이 아니기 떄문에?
                // 질문 2 NEXT와 next라인의 정확한 차이점이 무엇?
            }
            System.out.println(sum);
            sum = 0;
        }


    }
}

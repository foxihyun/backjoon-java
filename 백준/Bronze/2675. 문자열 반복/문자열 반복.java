import java.util.*;

public class Main {
    public static void main(String[] args) {
        //T 입력. (테스트 횟수);
        //R 입력. (반복 횟수)
        //문자열 입력 -> 반복 횟수 합쳐서 출력
        //charat[i] * R 출력

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        while(count<T)
        {
            int R = sc.nextInt();
            String S = sc.next();

            for(int j=0;j<S.length();j++) { //출력 부분
                for (int i = 0; i < R; i++) {
                    System.out.printf("%s", S.charAt(j));
                }
            }
            System.out.println(); // 줄바꿈
            count++;
        }

    }
}
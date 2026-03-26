/*
2775 부녀회장이 될테야

시간제한 0.5초

조건: 한 층의 b호에 사려면
아래 층 1호부터 ~b호까지 합을 데려와서 살아야함
1.T 번 반복case
한번의 입력 (k,n)
k층의 n호에는 몇명이 사는지

0층 1호 -> 1명
0층 2호 ->2명

일반화를 해야함


1층 3호

(2,3)
2층 3호


1 5 15 35 70
1 4 10 20 35 2층
1 3 6  10  15 1층
1 2 3  4   5   0층

1.입력에 따른 배열 n을 만든다.
1. 1~n 배열을 채워준다 O(n) n은 1~n까지지만 (인덱스는 n-1)처리 (0층 채우기)
2. k번 반복하여 배열을 다시 채워넣어준다. (왼쪽 누적합)


인덱스와 순서(1부터 시작) 구별 잘해야함
잘못하면 배열 오류 뜬다
 */
package silver;

import java.util.Scanner;

public class S2775 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int CountT = 0;
        while (CountT < T) {

            int k = sc.nextInt();
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) //0층 배열 채워넣기
            {
                a[i] = i + 1; // 0층의 값은 n에 따라 채워짐. if (2,3) ->a는 1,2,3으로 채워짐 0층 기준

            }
            int count = 0; //초기화

            while (count < k) {
                for (int j = 1; j < n; j++) // 누적합 a[1,2,3] k층이 궁금하면 k번 반복해서 올라가야함 //인덱스이므로 n-1까지만 가야함
                {
                    a[j] = a[j] + a[j - 1]; // j=0 1층일때, 1+2 = 3 j=1; 2층일때
                }
                count++;
            }
            System.out.println(a[n - 1]); //출력 n은 1~n까지지만 인덱스는 n-1처리해야함
            CountT++;
        }

    }
}

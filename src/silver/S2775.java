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

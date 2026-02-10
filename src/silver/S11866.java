package silver;

import java.util.Scanner;

public class S11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        int count = 0;
        int i = 0;//인덱스
        int j = 0;// 몇 개 채워넣었나(큰 while 탈출 조건)
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (j<n) //인덱스이므로 인덱스가 다 채워질때까지
        {
            while (count < k) { //배열 계속 돌아주면서 채움

                if (a[i] == 0) {
                    count++;
                    if (count==k) break; //작은 while 탈출
                }
                i = (i + 1) % n; //인덱스+1= n이다!!! 또 i++해주면 안됨. 헷갈림 주의

            }
            a[i] = 1;
            if(j != n-1) sb.append(i+1).append(',').append(' ');
            else sb.append(i+1).append(">");
            count = 0;
            j++;
        }

        System.out.println(sb);
    }
}

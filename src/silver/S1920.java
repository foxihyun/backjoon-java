package silver;

import java.util.Arrays;
import java.util.Scanner;

public class S1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(a); //a 정렬하기 이분탐색은 정렬된 배열로부터만 가능!!
        int m = sc.nextInt(); //2번째 입력
        for(int i=0;i<m;i++) // 다 돌아야함.
        {
            int b= sc.nextInt();
            //b를 a배열에서 이분탐색
            int cond = 0; //못찾았을떄
            int l = 0;
            int r = n - 1;


            while(l<=r)
            {
                int mid = (l + r) / 2;
                if (b == a[mid]) //찾음
                {
                    sb.append("1").append("\n");
                    cond = 1;
                    break;
                }
                if (b < a[mid]) // b가 mid의 왼쪽에 있을 경우
                {
                    r = mid-1;
                    continue;
                }
                if(b > a[mid])
                {
                    l=mid+1;
                    continue;
                }
            }
            if(cond==0)  sb.append("0").append("\n"); //while문 돌았는데 없다? 그러면 없는 것
        }
        System.out.print(sb); //한번에 출력
    }
}

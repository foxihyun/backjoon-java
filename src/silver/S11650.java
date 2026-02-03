package silver;

import java.util.Arrays;
import java.util.Scanner;

public class S11650 {
    public static void main(String[] args) {
        //이차원 배열 받아서 처리
        //
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        int[][] dot = new int[N][2];
        while (i < N) {
            //질문1 : 연속 int 2개 어떻게 받는지?
            dot[i][0] = sc.nextInt();
            dot[i][1] = sc.nextInt();
            i++;
        }
        //정렬해줘야함. x (dot의 [i][0])을 먼저 정렬 -> 그 후 if x가 같으면 (dot의 [x][1]을 정렬
        //Arrays.sort(배열) 라이브러리
        //Arrays.sort(dot[N][0]); -이렇게 사용하는 것 아님
        Arrays.sort(dot, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]); // x 오름차순
            return Integer.compare(a[1], b[1]);                   // x 같으면 y 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for(i=0;i<N;i++)
        {
            sb.append(dot[i][0]).append(' ').append(dot[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}

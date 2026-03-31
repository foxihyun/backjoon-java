
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dot = new int[N][2];
        for(int i=0;i<N;i++)
        {
            dot[i][0]= sc.nextInt();
            dot[i][1]= sc.nextInt();
        } //모두 입력 받앗음
        int total = 1;

        Arrays.sort(dot, (o1,o2) -> {
            if(o1[1]==o2[1]){
                return o1[0]-o2[0];// y좌표가 같으면 x 오름차순으로
            }
            return  o1[1] - o2[1]; //y좌표 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(dot[i][0]).append(' ').append(dot[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
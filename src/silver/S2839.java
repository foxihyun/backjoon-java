
package silver;
import java.util.*;

public class S2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int five = n / 5;
        while (five >= 0) {
            int remain = n - five * 5;
            if (remain % 3 == 0) { //어차피 여기 조건에서 걸리면 봉지수가 최소임.
                int result = five + remain / 3;
                System.out.println(result); //출력하고 종료
                return;
            }
            five--;
        }

        System.out.println(-1);

    }
}//큰 봉지부터 담는다고 생각하면됨. 나누어떨어지면 바로 최소인거!!! 즉 배열 필요 업슴

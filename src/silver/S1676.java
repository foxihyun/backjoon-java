/*
1676 팩토리얼 0의 개수

입력 0~500
그냥 입력받으면 범위 터진다

어떤 팩토리얼

뒤가 0이 되는 방법
2*5 or 10이 들어가줘야함
2는 널렸음. 5의 개수가 중요함
1~4 5 x
5~24 * 5가 1개
25 ~124 5가 2개
5*5*5~500 5가 3개
누적해서 더해줘야함 팩토리얼이기때문에 어차피 올라가도 그 수는 곱해짐.
N / 5 + N/ 25 + N/ 125 -> 결국 5의 개수만 세면 됨.
->5의 배수를 세고, 25의 배수는 한 번 더 세고, 125의 배수는 또 한 번 더 센다
 */
package silver;

import java.util.Scanner;

public class S1676 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = N/5+N/25+N/125;
        System.out.println(total);
    }
}

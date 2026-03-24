/*
1436 영화감독 숌

3자리 1개
4자리 9개
5자리 81 * 3c2(3자리 중 2자리 택) = 243개
6자리 9^3 * 4c3
7자리 9^4 * 5
666_

666부터 9999999 for문 돌면서 '666'이 들어가 있으면 그 수를 a[i]에 넣기. O(N)
단, 이 수를 문자열로 보고 조건은 '666' 존재 시
i입력 받고
a[i] 출력
O{n) 꼴

★ 문자열이 있는지 검사하는 contains라는 기능이 있다!!

 */


package silver;

import java.util.Scanner;

public class S1436 {
    public static void main(String[] args) {

        int i=0;
        int a[] = new int[10000];
        int num = 666;
        Scanner sc = new Scanner(System.in);
        while(num<9999999 && i<10000) //일단 배열에 집어 넣는 작업 최대 7자리
        {
            String s = String.valueOf(num);
            if(s.contains("666")) // 666을 포함하면
            {
                a[i]=num;
                i++; //666은 0임 따라서 입력이 n 이라면 i= n-1을 출력해줘야함
                num++;
                continue;
            }
            else num++;
        }
        int Input = sc.nextInt();
        System.out.print(a[Input-1]);
    }
}

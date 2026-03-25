/*
BOJ 1018(체스판 다시 칠하기)

m*n 보드 -> 애는 막 칠해져있을 수 있음
->8*8 체스판으로 만들기

입력: m*n 보드와 색깔 입력

출력: 바꿔야하는 색의 최소 개수 (8*8 보드판을 만들때)
   0~32 한 줄에 최대 4개 바꾸면 되므로
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B

OR

W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W


입력 8 * 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW

나올 수 있는 모든 8*8 판을 뽑는다.
그 8*8에 대해  칠해야하는 칸 수를 센다

1)나올 수 있는 모든 8*8 판을 뽑는다.

M*N일때
좌상단이 (i,j)이라면
i= 0~n-8,
j=0~ m-8까지만 검사하면됨

ex) 10 13이면 i는 0~2 , j는 0~5까지 보면 됨 (2,5)

2. (한 번의 검사 케이스는 시작점기준 8*8을 돌려주면 된다.) 그걸 n-8 *m-8번 시행할 것임.
시작점을 잡는다.
if 시작 색 B면 BESTCASE -> BWBWBWBW
   시작 색 W면 best case  -> WBWBWBWB

그 점의 줄을 bestcase와 비교해서 다르면 count++;

다음 줄은 그 반대 bestcase와 비교해서 다른 만큼 count++;
8번 반복.

8개 잘라서 String 담고 각 best case와 비교해서 다르면 count ++
다음줄은 반대 best case와 비굫ㅐ서 다르면 count ++;
total 저장.
total 초기값은 다바꿔야한다고 가정한 4*8 32로. total이 작아야함.
 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ위의 방법으로 하면 안됨
내가 시도했던 방식 -> W로 시작하면 BestCase는 wbwbwbwb일 것이다
But -> 베스트케이스는 처음을 w->B로 바꾸는 것일수도 있음
8*8을 체슾ㅏㄴ으로 만들기 위해 다시 칠해야하는 최소 칸 수
-> W로 시작하는 체스판 / B로 시작하는 체스판 둘 다 계산해서 적은 값을 써야함

countW -> 맨위가 W인 체스판을 만드려고할때 다시 칠해야하는 칸 수

내가 이 문제에서 막혔던 이유
왜 a[i][j] 첫 칸 색으로 결정하려했었는데  현재 보드가 어떤 색으로 시작하든,
W-start로 바꾸는 경우와 B-start로 바꾸는 경우 둘 다 가능하기 때문에 그렇게 풀면 안됨.


 */
package silver;

import java.util.Scanner;

public class S1018 {
    public static void main(String[] args) {
        String StartWithW = "WBWBWBWB";
        String StartWithB = "BWBWBWBW";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] a = new char[n][m];
        for(int i=0;i<n;i++)
        {
            String s = sc.next(); //ex)WWWWWWWWWW
            for(int j=0;j<m;j++)
            {
                a[i][j] = s.charAt(j);
            }
        } //입력 다 받았음

        int total = 32;

        //검사 알고리즘 시작
        for(int i = 0; i<=n-8;i++){
            for(int j = 0; j<=m-8;j++) // 시작점 검사할 최대 경우의 수
            {
                int countW = 0; //(i,j)를 W로 시작한다고 가정
                int countB = 0; //(i,j)를 B로 시작한다고 가정

                for(int k=0;k<8;k++) // 8*8 검사 (시작점 한 cycle
                {
                    for(int l=0;l<8;l++)
                    {
                        if(k % 2 == 0) //짝수자리 0,2,4,6
                        {
                            if(a[i+k][j+l] != StartWithW.charAt(l)) countW++;
                            if(a[i+k][j+l] != StartWithB.charAt(l)) countB++;
                        }
                        else{ //홀수자리
                            if (a[i + k][j + l] != StartWithB.charAt(l)) countW++;//다음 줄은 반대이므로 STARTWITHB로 본다
                            if (a[i + k][j + l] != StartWithW.charAt(l)) countB++;
                        }

                    }
                }

                if (countW < total) total = countW;
                if (countB < total) total = countB;
            }
        }
        System.out.println(total);
    }
}


import java.util.*;

public class Main {
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
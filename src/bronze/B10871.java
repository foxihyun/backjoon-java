package bronze;

import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n;i++)
        {
            int num = sc.nextInt();

            if(num<x) sb.append(num).append(' '); // num num num 식으로 출력
        }
        System.out.print(sb);
    }
}

package bronze;

import java.util.Scanner;

public class B2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            int star =0;
            while(space>0) {//공백 출력 for문
                System.out.printf(" ");
                space--;
            }
            while(star<i)
            {
                System.out.print("*");
                star++;
            }
            System.out.println();
        }
    }
}

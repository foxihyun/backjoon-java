package bronze;

//백준 제출할 때 패키지 아래에 있으면 안됨.

import java.io.*;
import java.util.*;

public class B2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i =1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
    }
}

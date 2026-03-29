
import java.awt.*;
import java.util.*;

public class Main {

    static int AlphaToInt(char A)
    {
        int changeA = A;
        return changeA - 96; // return 값은 a= 1 ~ z =26으로
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String st = sc.next();
        long total = 0;
        long r=1;
        long M = 1234567891;
        for(int i=0;i<st.length();i++)
        {
           total = (total + AlphaToInt(st.charAt(i)) * r) % M;
           r = (r * 31) % M;
        }
        System.out.println(total % 1234567891);
    }
}
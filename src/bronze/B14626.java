package bronze;

import java.util.Scanner;

public class B14626 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int isbn[] = new int[13];
        String input = sc.nextLine();
        int total = 0;
        int starIndex = 0;
        int starValue = 0;
        for(int i = 0; i<input.length();i++)
        {
            if (input.charAt(i) != '*') {
                isbn[i] = input.charAt(i) - '0'; //CHAR->INT
                if (i%2 == 0){ // *1
                    total = (isbn[i] + total) % 10;
                }
                else total =  (3*isbn[i] + total) % 10;
            }
            else {
                isbn[i] = 0; // *일경우에는 일단 0 넣어주기
                starIndex= i; //인덱스 찾았음.
            }
        } //isbn에는 정수 형태로 모두 들어갔음

        int baseTotal = total; // 미리 저장해두기 *값 제외한 것
        for(starValue =0 ; starValue<10;starValue++)
        {
            int weight = (starIndex % 2 == 0) ? 1 : 3;
            if ((baseTotal + weight * starValue) % 10 == 0) {
                break;
            }

        }
        System.out.println(starValue);
    }
}

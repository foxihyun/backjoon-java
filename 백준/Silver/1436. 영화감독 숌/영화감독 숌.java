import java.util.*;

public class Main {
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
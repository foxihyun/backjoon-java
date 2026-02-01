package silver;

import java.util.Scanner;

//(()())((()))
// (-> 나오면 변수 open ++
// )-> 나오면 변수 close ++
// if close가 open보다 많아지면 vps 아님
public class S9012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i=0;
        while(i<T)
        {
            int cond = 1; // 판별 기준
            String S = sc.next();
            int open = 0; // (
            int close = 0; // )
            for(int j=0;j<S.length();j++) //문자열 판별
            {
                if(S.charAt(j)=='(')
                {
                    open++;
                }

                if(S.charAt(j)==')')
                {
                    close++;
                }

                if(close>open)//
                {
                    cond = 0;
                    break;
                }
            }
            if(open != close) cond=0; //다 돌았는데 open close 같지않으면 condi는 0
            if(cond== 0)
            {
                System.out.println("NO");
            }
            else System.out.println("YES");


            i++; //테스트클래스++
        }
    }
}

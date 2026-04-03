import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(); //스택 클래스 이용하기

        int k = sc.nextInt();

        for(int i=0;i<k;i++)
        {
            int n = sc.nextInt();

            if(n!=0) {
                stack.push(n);
            }
            else {
               stack.pop();
            }
        } // 2번 단계

        int total=0;
        while(!stack.empty()){
            total+=stack.pop();
        }
        System.out.print(total);
    }
}
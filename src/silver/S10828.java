package silver;

import java.util.Scanner;

public class S10828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int i =0;
        int[] stack = new int[T];
        int top = 0;
        while(i<T)
        {
            String command = sc.next();

            if(command.equals("push")) //push x;
            {
                int x = sc.nextInt();
                stack[top++] = x; //
            }

            if(command.equals("pop"))
            {
                if(top==0) System.out.println("-1");
                else System.out.println(stack[--top]);
            }

            if(command.equals("size"))
            {
                System.out.println(top);
            }

            if(command.equals("empty"))
            {
                if(top==0) System.out.println("1");
                else System.out.println("0");
            }

            if(command.equals("top"))
            {
                if(top != 0) System.out.println(stack[top-1]);
                else System.out.println("-1");
            }
            i++;
        }
    }
}

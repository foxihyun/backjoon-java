
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 1;
        while(N>0){
            total *= N;
            N--;
        }

        System.out.println(total);
    }
}
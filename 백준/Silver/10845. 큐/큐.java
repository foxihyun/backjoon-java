//주어질때마다 출력이므로 scanner 쓰자
import java.util.*;
import java.io.*;
public class Main {

    int infront;
    int rear;
    int[] queue = new int[10001]; //기본형으로 만들면 null대신 0으로 채워짐.
    int size = queue.length;


    public boolean IsNull(){
        infront %= size;
        rear %= size;
        return(infront==rear);
        //->int[] queue = new int[10001]; 처럼 **기본형 배열(int[])**을 만들면, 배열 원소는 null이 될 수가 없음.
    }

    public boolean IsFull() {
        return ((rear+1) % size == infront);
    }

    public void Push(int x){

            queue[rear++] = x;
    }

    public int pop(){

        if(IsNull()) {
            return -1;
        }
        else return queue[infront++];

    }

    public int Size(){

        if(infront-rear<0) return rear-infront;
        else return infront-rear;
    }
    public int empty()
    {
        if(IsNull()) return 1;
        else return 0;
    }

    public int front(){
        if(IsNull()) return -1;
        else return queue[infront];
    }

    public int back(){
        if(IsNull()) return -1;
        else return queue[rear-1];
    }
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       Main q = new Main(); //
       for (int i=0;i<n;i++) {
           String command = sc.next();

           if (command.equals("push")) {

               int pushInt = sc.nextInt();
               q.Push(pushInt);
           }

           if (command.equals("pop")) {
               System.out.println(q.pop());
           }


           if (command.equals("size")) {
               System.out.println(q.Size());

           }

           if (command.equals("empty")) {
               System.out.println(q.empty());
           }

           if (command.equals("front")) {
               System.out.println(q.front());
           }

           if (command.equals("back")) {
               System.out.println(q.back());
           }

       }


    }
}

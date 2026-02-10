package silver;

import java.util.*;

public class S10845 {

    int infront;
    int rear;
    int[] queue = new int[10001]; // 기본형 배열은 null 불가
    int size = queue.length;

    public boolean IsNull() {
        infront %= size;
        rear %= size;
        return (infront == rear);
    }

    public boolean IsFull() {
        return ((rear + 1) % size == infront);
    }

    public void Push(int x) {
        queue[rear++] = x;
    }

    public int pop() {
        if (IsNull()) return -1;
        return queue[infront++];
    }

    public int Size() {
        if (infront - rear < 0) return rear - infront;
        else return infront - rear;
    }

    public int empty() {
        return IsNull() ? 1 : 0;
    }

    public int front() {
        if (IsNull()) return -1;
        return queue[infront];
    }

    public int back() {
        if (IsNull()) return -1;
        return queue[rear - 1];
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        S10845 q = new S10845();

        for (int i = 0; i < n; i++) {
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

        sc.close();
    }
}

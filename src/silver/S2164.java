package silver;

import java.io.*;
import java.util.*;

public class S2164 {

    static class StackQueue {
        int front = 0;
        int rear = 0;
        Object[] queue;

        public StackQueue(int capacity) {
            queue = new Object[capacity];
        }

        public boolean isFull() {
            return front == rear && queue[front] != null;
        }

        public boolean isEmpty() {
            return front == rear && queue[front] == null;
        }

        public void enqueue(Object data) {
            // 백준에서는 웬만하면 출력 X (디버그 출력이 오답 유발)
            if (isFull()) throw new IllegalStateException("full");
            queue[rear++] = data;
            rear %= queue.length;
        }

        public Object dequeue() {
            if (isEmpty()) throw new NoSuchElementException();
            Object dequeuedData = queue[front];
            queue[front++] = null;
            front %= queue.length;
            return dequeuedData;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        // TODO 1) 큐 만들기
        S2164.StackQueue q = new S2164.StackQueue(n);

        // TODO 2) 1~n enqueue
        for(int i=1;i<=n;i++)
        {
            q.enqueue(i); //1부터 다 넣기
        }

        // TODO 3) 2164에서 요구하는 연산을 반복
        while(true)
        {
            int a= (int) q.dequeue();//하나 버리기
            if(q.isEmpty()) {//하나 버렸는데 비었으면 탈출조건
                result = a;// 저장하고 탈출
                break;
            }

            int b = (int) q.dequeue(); //하나 버리고
            q.enqueue(b); // 하나 넣기

        }

        // TODO 4) 마지막 남은 값 출력
        System.out.println(result);
    }
}


import java.util.*;

//큐란? https://yoongrammer.tistory.com/46
public class StackQueue {
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
        if (isFull()) {
            System.out.println("큐에 더 이상 데이터를 저장할 공간이 없습니다.");
            return;
        }
        queue[rear++] = data;
        rear %= queue.length;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다");
            throw new java.util.NoSuchElementException(); // 질문 1 이건 뭐임 throw를 직접 발생시키는 것
        }
        Object dequeuedData = queue[front]; //질문2 왜 int가 아니라 Object인지 참조타입이라서?
        queue[front++] = null;
        front %= queue.length;
        return dequeuedData;
    }
    // ✅ 2) 사용 예시
    public static void main(String[] args) {
        StackQueue q = new StackQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);
        q.enqueue(50);

        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
        System.out.println(q.dequeue()); // 50
    }
}
 // 원형 큐



package silver;

import java.util.Arrays;
import java.util.Scanner;

//10816 숫자 카드 2
//n개 숫자 입력 받음(중복 가능)
//m개 입력 받음 (중복 x) -> 그 각각의 수가 m에 몇 개 있나
//테스트 케이스 크기보니까 전체 탐색하면 시간초과 날듯
//중복 없는 m을 정렬. 그리고
//있냐 없냐는 아까 보니까 hashmap를 이용해보라던데..-> 이 문제는 중복까지 고려해야함
//일단 중복 고려하지말고 a 배열 정렬.
//그리고 이분 탐색을 하되 중복 고려해줘야하니까 조건을 걸어주면됨 .
//질문 c언어에선 함수 만들줄 아는데 JAVA는 어떻게 만들어야함? -객체 공부해야한다!!
//BufferedReader + StringTokenizer + StringBuilder 시간 줄이려면 이거 써야하나?
//그래도 시간초과, 즉 -> 찾고 나서 mid 옮겨서 중복 세기 방법은 비효율적
public class S10816 {

    static int lowerbound(int[] arr, int target) {
        //그 수가 처음 나타나는 위치
        //즉 처음으로 arr[idx]>= target이 되는 idx
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= target) //찾아도 계속 내려갈수 있을떄까지(중복고려)
                r = mid; //r=mid-1을 쓰면 안됨 왜지??
                // 처음위치가 mid일수도있고 더 왼쪽에 있을 수 있음
                // 그래서 후보 구간을 줄이되 mid는 포함해야함.

            else l = mid + 1; // 답이 안나온거니까 배제하고 1추가해줘도됨.
        }
        return l; //처음 나온 위치(index임)
    }

    static int upperbound(int[] arr, int target) {
        //그 수보다 큰 수가 처음 나타나는 위치
        //즉 arr[mid] > target
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] > target) // mid보다 왼쪽에 존재
                r = mid;

            else
                l = mid + 1;
        }
        return l; //마지막으로 나온 위치(index임)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a); //정렬 끝

        int m = sc.nextInt();


        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < m; j++) {
            int x = sc.nextInt();
            int times = upperbound(a, x) - lowerbound(a, x);
            sb.append(times).append(' ');
            ;
        }
        System.out.println(sb);
        //정렬된 a함수 ex> 1 1 2 3 3 3 이라 친다면 처음 3이 나오는 index.
    }
}


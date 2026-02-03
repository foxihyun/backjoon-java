import java.util.*;
//10816 숫자 카드 2
//n개 숫자 입력 받음(중복 가능)
//m개 입력 받음 (중복 x) -> 그 각각의 수가 m에 몇 개 있나
//테스트 케이스 크기보니까 전체 탐색하면 시간초과 날듯
//중복 없는 m을 정렬. 그리고
//있냐 없냐는 아까 보니까 hashmap를 이용해보라던데..-> 이 문제는 중복까지 고려해야함
//일단 중복 고려하지말고 a 배열 정렬.
//그리고 이분 탐색을 하되 중복 고려해줘야하니까 조건을 걸어주면됨 .
//질문 c언어에선 함수 만들줄 아는데 JAVA는 어떻게 만들어야함?
//BufferedReader + StringTokenizer + StringBuilder 시간 줄이려면 이거 써야하나?
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i= 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a); //정렬 끝

        int m=sc.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]= sc.nextInt();
        }

        int l=0;
        int r=n-1;// a배열에서 찾아야하므로
        int i=0;
        StringBuilder sb = new StringBuilder();
        for(i=0;i<m;i++) {
            int count = 0;
            while (l <= r) {
                int mid = (l + r) / 2;

                if (b[i] == a[mid]) //찾음
                {
                    while (a[mid] == a[mid-1]) {
                        mid--;
                    }//이 while문이 끝나면 중복의 시작지점
                    while (a[mid+1] == a[mid]) {
                        count++; // 중복 갯수임
                        sb.append(count).append(' ');
                    }
                    break;
                }

                if (b[i] < a[mid]) // b가 mid의 왼쪽에 있을 경우
                {
                    r = mid - 1;

                }
                if (b[i] > a[mid]) {
                    l = mid + 1;
                }
                i++;
            } //이중탐색 While문 끝
        }//for문 끝
        sb.append('0').append(' ');//못찾앗으므로 0 추가
        System.out.println(sb);
    }
}
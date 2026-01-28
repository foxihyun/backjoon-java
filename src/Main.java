import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 문자열 입력 -> a부터 z까지 모두 출력해주되 알파벳이 나오면 나오는 처음 위치, 없으면 -1 출력
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // 문자열 입력 받음
        //자바로 하나
        int[] Out = {-1, -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}; //초기화
        //인덱스 찾기 charat이용해서 그 위치에 넣어주기~~
        //예외는 중복일때?
        //질문-> 그러면 int[] out = new int[23]; 이랑 저렇게 직접 넣어주는 것이랑 뭐가 다른지?

        for(int i =0;i<s.length();i++)
        {
            int Num = s[i]-'a';
            // 예를들어 b다. s[0] -'a' -> 1 임. 그러면Our[1]= 0 이런 식으로 차곡 차곡 넣어주면됨.
            // 대신 조건을 걸어야지 첫 등장일 경우에만 -> Out[A] == -1 일때만
            if(Out[A]== -1)
            {

            }
        }

    }
}
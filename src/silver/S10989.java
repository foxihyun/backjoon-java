package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S10989 {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[] cnt = new int[10001];

            for(int i=0;i<n;i++)
            {
                cnt[Integer.parseInt(br.readLine())]++;
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= 10000; i++) {
                int c = cnt[i];
                while (c-- > 0) {
                    sb.append(i).append('\n');

                }
            }
            System.out.println(sb);
            bw.flush();
        }

    }

//int[] arr = new int[n];로 선언하면 n이 최대 10000000이기 때문에 4*10000000하면 40mb임.
//조건을 잘 봐야하는 이유.
        /*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++)
        {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }
    */




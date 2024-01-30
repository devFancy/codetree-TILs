import java.util.*;
import java.io.*;

public class Main {
    static final int INT_MAX = Integer.MAX_VALUE;
    static final int MAX = 100 + 10;
    public static void main(String[] args) throws IOException {
        
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] person = new int[MAX];
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            person[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 각 i번째 집으로 모였을 때의 합 구하기
        int answer = INT_MAX;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += Math.abs(j - i) * person[j];
            }
            answer = Math.min(answer, sum);
        }

        // 2. 출력
        bw.write(String.valueOf(answer));

        // 3. 종료
        bw.close();
        br.close();
    }
}
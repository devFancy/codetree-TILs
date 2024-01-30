import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 20 + 10;
    static int N;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
         // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        arr = new int[MAX][MAX];

        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 1. 1 * 3 크키 격자 내에 들어올 수 있는 최대 동전의 수 구하기
        int maxCnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-2; j++) {
                maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j + 1] + arr[i][j + 2]);
            }
        }

        // 2. 출력
        bw.write(String.valueOf(maxCnt));

        // 3. 종료
        bw.close();
        br.close();
    }
}
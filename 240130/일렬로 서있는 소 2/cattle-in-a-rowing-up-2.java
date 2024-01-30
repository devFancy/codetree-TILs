import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 100 + 10;
    static int n;
    static int[] arr = new int[MAX];
    public static void main(String[] args) throws IOException {

        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 조건을 만족하는 서로 다른 쌍의 수 구하기
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    if(arr[i] < arr[j] && arr[j] < arr[k]) {
                        cnt++;
                    }
                }
            }
        }
        
        // 2. 출력
        bw.write(String.valueOf(cnt));

        // 3. 종료
        bw.close();
        br.close();

    }
}
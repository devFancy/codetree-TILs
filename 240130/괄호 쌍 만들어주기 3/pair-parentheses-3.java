import java.util.*;
import java.io.*;

public class Main {
    static final int INX_MAX = Integer.MAX_VALUE;
    static final int MAX = 100 + 10;
    static int n;
    static char[] arr = new char[MAX];
    public static void main(String[] args) throws IOException {

        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
        }
        
        // 1. 갯수 구하기
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == '(' && arr[j] == ')')
                    cnt++;
            }
        }
        // 2. 출력
        bw.write(String.valueOf(cnt));

        // 3. 종료
        bw.close();
        br.close();
    }
}
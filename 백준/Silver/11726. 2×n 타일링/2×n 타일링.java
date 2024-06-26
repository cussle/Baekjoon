import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int[] dp = new int[1000];

        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < 1000; i++) {  // i = n - 1
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 10007;
        }

        System.out.println(dp[n - 1]);
    }
}

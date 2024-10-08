import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringTokenizer st0 = new StringTokenizer(S, "1");
        StringTokenizer st1 = new StringTokenizer(S, "0");

        System.out.println(Math.min(st0.countTokens(), st1.countTokens()));
    }
}

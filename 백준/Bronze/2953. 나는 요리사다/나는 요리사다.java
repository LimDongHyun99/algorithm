import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int index = 1;
        int score = 0;
        for (int i = 1; i <= 5; i++) {
            st = new StringTokenizer(br.readLine());
            int max = 0;
            while (st.hasMoreTokens()) {
                max += Integer.parseInt(st.nextToken());
            }
            if (max > score) {
                index = i;
                score = max;
            }
        }
        System.out.print(index + " " + score);
    }
}